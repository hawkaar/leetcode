package src;

//this another way of doing it with
//Time complextisty: O(n^2)
//Space : O(n^2)

public class LonegestPalindromMethod2 {
    public static void main(String[] args) {
        String s = "a";
        System.out.println(longestPalindrome(s));
    }

    private static String longestPalindrome(String s) {
        int n = s.length(); //length of input String
        int start = 0;  //Start index of the Palindrome
        int maxLength = 1;  //Maximum length of a palindrome available

        // table[i][j] will be false if
		// substring str[i..j] is not palindrome.
		// Else table[i][j] will be true
        boolean[][] table = new boolean[n][n];

        // All substrings of length 1 are palindromes
        for (int i = 0; i < n; i++) {
            table[i][i] = true;
        }

        // check for sub-string of length 2.
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                table[i][i+1] = true;
                start = i;
				maxLength = 2;             
            }
        }


        // Check for lengths greater than 2.
		// k is length of substring
        // i is starting index
        // j is ending index
        for (int k = 3; k <= n; k++) {
            for (int i = 0; i <= n-k; i++) {
                int j = i + k - 1;

                if(table[i+1][j-1] && s.charAt(i) == s.charAt(j)){
                    table[i][j] = true;

                    if(k > maxLength){
                        start = i;
                        maxLength = k;
                    }
                }

            }
        }
        return s.substring(start, start + maxLength);
    }
}