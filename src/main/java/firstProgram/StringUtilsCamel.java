package firstProgram;

public class StringUtilsCamel {
    public static String toCamelCase(String input) {
        if (input == null || input.isEmpty()) return "";
        String[] words = input.split("[^a-zA-Z]+");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                String word = words[i].toLowerCase();
                result.append(i == 0 ? word : Character.toUpperCase(word.charAt(0)) + word.substring(1));
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
