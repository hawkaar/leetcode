public class checkPanagram {
    public static void main(String[] args) {
        String sentence = "abcdefghijklmnopqrstuvwxyz";

        System.out.println(checkIfPangram(sentence));
    }


    public static boolean checkIfPangram(String sentence) {
        return sentence.chars().distinct().count()==26?true:false; 
    }

    // public static boolean checkIfPangram(String sentence) {

    //     int[] alphabetsUsed = new int[26];

    //     if (sentence.length() < 26)
    //         return false;

    //     for (int i = 0; i < sentence.length(); i++) {
    //         alphabetsUsed[sentence.charAt(i) - 'a']++;
    //     }

    //     for (int i = 0; i < alphabetsUsed.length; i++) {
    //         if (alphabetsUsed[i] == 0) {
    //             return false;
    //         }
    //     }

    //     return true;
    // }
}
