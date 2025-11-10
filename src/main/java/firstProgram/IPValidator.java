package firstProgram;

public class IPValidator {

    static String validateIP(String ip) {
        String result = "Invalid IP";
        // Разделяем строку по точкам, учитывая, что точка - специальный символ в regex
        String[] parts = ip.split("\\.");

        // Проверяем, что есть ровно 4 части
        if (parts.length != 4) {
            return result;
        }

        for (String part : parts) {
            // Проверяем, что часть не пустая
            if (part.isEmpty()) {
                return result;
            }
            try {
                int num = Integer.parseInt(part);
                // Проверяем диапазон числа
                if (num < 0 || num > 255) {
                    return result;
                }
                // Проверяем наличие ведущих нулей (кроме случая "0")
                if (part.length() > 1 && part.charAt(0) == '0') {
                    return result;
                }
            } catch (NumberFormatException e) {
                // Если часть не является числом
                return result;
            }
        }
        return "Valid IP";
    }

    public static void main(String[] args) {
        // Тестовые случаи
        String[] testIPs = {
                "192.168.1.1",
                "255.255.255.255",
                "0.0.0.0",
                "256.1.2.3",
                "1.2.3.4.5",
                "1.2..3",
                "1.02.3.4",
                "abc.def.ghi.jkl",
                "192.168.1.256",
                "127.0.0.1",
                "10.0.0.1"
        };

        System.out.println("Проверка корректности IP-адресов:");
        System.out.println("=================================");

        for (String ip : testIPs) {
            String result = validateIP(ip);
            System.out.println(ip + " -> " + result);
        }

        // Дополнительно: можно вводить IP с клавиатуры
        System.out.println("\nДля ручной проверки введите IP-адрес (или 'exit' для выхода):");

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        while (true) {
            System.out.print("Введите IP: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            String result = validateIP(input);
            System.out.println("Результат: " + result);
        }

        scanner.close();
        System.out.println("Программа завершена.");
    }
}
