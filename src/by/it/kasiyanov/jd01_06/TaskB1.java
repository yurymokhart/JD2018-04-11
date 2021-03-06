package by.it.kasiyanov.jd01_06;

public class TaskB1 {
    public static void main(String[] args) {
        String[] words = Poem.text.split("[^а-яёА-ЯЁ]+");

        for (String word : words) {
            if (check(word)){
                System.out.println(word);
            }
        }
    }

    private final static String g1 = "аоеёиуыэюяАОЕЁИУЫЭЮЯ";

    private static boolean check(String word){

        char first = word.charAt(0);
        char last = word.charAt(word.length() - 1);
        return g1.indexOf(first) < 0 && g1.indexOf(last) >= 0;

    }
}
