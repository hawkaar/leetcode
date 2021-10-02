public class NumDecode {
    public static void main(String[] args) {
        String s = "210";

        System.out.println(numDecodings(s));
    }

    public static int numDecodings(String s) {
        int n = s.length();
        if (s.charAt(0) == '0')
            return 0;
        if (n == 1)
            return 1;
        int[] dp = new int[n + 5];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            int num = s.charAt(i - 1) - '0';
            int m = ((s.charAt(i - 2) - '0') * 10) + num;
            if (num > 0)
                dp[i] += dp[i - 1];
            if (m > 9 && m < 27)
                dp[i] += dp[i - 2];
        }
        return dp[n];
    }

}
