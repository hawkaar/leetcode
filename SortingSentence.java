import java.util.Arrays;

public class SortingSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";

        System.out.println(sortSentence(s));
    }


    public static String sortSentence(String s) {

        String[] unordered = s.split(" ");
        String[] ordered = new String[unordered.length];

        for (int i = 0; i < unordered.length; i++) {
            int lastChar = unordered[i].length() - 1;
            int correctIndexOfWord = Character.getNumericValue(unordered[i].charAt(lastChar)) - 1;

            ordered[correctIndexOfWord] = unordered[i].substring(0, lastChar);

        }

        String output = "";
        for (int i = 0; i < ordered.length; i++) {

            if (i == ordered.length-1) {
                output += ordered[i];
                break;
            }
            output += ordered[i] + " ";
        }

        return output;
    }
}
