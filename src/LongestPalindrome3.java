public class LongestPalindrome3 {
    public static void main(String[] args) {
        String s = "forgeeksskeegfor";
        System.out.println(longestPalindrome(s));
    }

    private static String longestPalindrome(String s) {
        int n = s.length();
        int low, high;
        int max = 1;
        int start = 0;

        for (int i = 1; i < n; i++) {
            low = i - 1;
            high = i;
            while (low >=0 && high < n
            && s.charAt(low) == s.charAt(high)) {
               
                if (high - low +1 > max) {
                    start = low;
                    max = high -low + 1;
                }
                low--;
                high++;
            }

            low = i - 1;
            high = i + 1;
            while (low >=0 && high < n
            && s.charAt(low) == s.charAt(high)) {
                
                if (high - low +1 > max) {
                    start = low;
                    max = high -low +1;
                }
                low--;
                high++;
            }

        }

        



        return s.substring(start, start + max);
    }
}
