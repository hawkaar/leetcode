package src;

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
        return String.join(" ", ordered);
    }
}
