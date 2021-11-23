package src;

public class NestingDepth {
    public static void main(String[] args) {
        String s = "(()(())((())))";

        System.out.println(maxDepth(s));
    }

    private static int maxDepth(String s) {

        int maxDepth = 0;
        int leftBracket = 0;


        for (int i = 0 ; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                leftBracket++;
                maxDepth = Integer.max(maxDepth, leftBracket);
            }else if (s.charAt(i) == ')') {
                leftBracket--;
            }

            
        }


        return maxDepth;
    }
}
