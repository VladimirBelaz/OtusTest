package firstProgram;

public class WordUtils {
    public static String reverseWords(String inputText) {
        if (inputText == null || inputText.isEmpty()) {
            return "";
        }
        //Разбиваем на слова и собираем в обратном порядке
        String[] words = inputText.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    private WordUtils() {

    }

    public static void main(String[] args) {
        System.out.println("Ввод пустой строки - " + WordUtils.reverseWords(""));
        System.out.println("Ввод одного слова - " + WordUtils.reverseWords("word"));
        System.out.println("Ввод двух слов - " + WordUtils.reverseWords("два слова"));
        System.out.println("Ввод трех слов - " + WordUtils.reverseWords("три слова здарова"));
        System.out.println("Ввод трех слов - " + WordUtils.reverseWords("четыре не слова здарова"));
    }
}
