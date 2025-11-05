package firstProgram;

public class StringUtilsCamel {
    public static String toCamelCase(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        // Разделяем строку на слова по не-буквенным символам
        String[] words = input.split("[^a-zA-Z]+");
        StringBuilder result = new StringBuilder();
        boolean isFirstWord = true;

        for (String word : words) {
            if (!word.isEmpty()) {
                if (isFirstWord) {
                    // Первое слово в нижнем регистре
                    result.append(word.toLowerCase());
                    isFirstWord = false;
                } else {
                    // Последующие слова с заглавной буквы
                    if (word.length() > 1) {
                        result.append(Character.toUpperCase(word.charAt(0)))
                                .append(word.substring(1).toLowerCase());
                    } else {
                        result.append(word.toUpperCase());
                    }
                }
            }
        }

        return result.toString();
    }

    private StringUtilsCamel() {

    }

    public static void main(String[] args) {
        System.out.println("Строка \"my camel * case string 1\" должна преобразоваться в myCamelCaseString - "
                + StringUtilsCamel.toCamelCase("my camel * case string 1"));
    }
}
