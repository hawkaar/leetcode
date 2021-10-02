
public class ConsistentStrings {
    public static void main(String[] args) {
        String[] words = {"ad","bd","aaab","baa","badab"};
        String allowed = "ab"; 

        System.out.println(countConsistentStrings(allowed, words));
    }

    public static int countConsistentStrings(String allowed, String[] words) {

        int consistent = 0;
        for (String string : words) {
            boolean isValid = true;
            for (char ch : string.toCharArray()) {
                if (!allowed.contains(String.valueOf(ch))) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) consistent++;
        }
        return consistent;
    }
}
