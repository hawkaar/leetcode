public class NestingDepth {
    public static void main(String[] args) {
        String s = "(()(())((())))";

        System.out.println(maxDepth(s));
    }

    private static int maxDepth(String s) {

        int maxDepth = 0;
        int LBracket = 0;


        for (int i = 0 ; i < s.length(); i++) {
            
            if (s.charAt(i) == '(') {
                LBracket++;
            }else if (s.charAt(i) == ')') {
                LBracket--;
            }

            maxDepth = Integer.max(maxDepth, LBracket);
        }


        return maxDepth;
    }
}
