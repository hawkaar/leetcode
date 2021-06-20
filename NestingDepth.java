public class NestingDepth {
    public static void main(String[] args) {
        String s = "(()(())((())))";

        System.out.println(maxDepth(s));
    }

    private static int maxDepth(String s) {

        int maxDepth = 0;
        int LBracket = 0;


        for (Character cChar : s.toCharArray()) {
            if (cChar == '(') {
                LBracket++;
            }else if (cChar == ')') {
                LBracket--;
            }

            maxDepth = Integer.max(maxDepth, LBracket);
        }


        return maxDepth;
    }
}
