package src;

public class SplitStringBalance {
    public static void main(String[] args) {
        String s = "RRLLRLLRL";
        System.out.println(balancedStringSplit(s));
    }

    public static int balancedStringSplit(String s) {
        int count = 0;
        int numOfBSS = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                count++;
            }else{
                count--;
            }

            if (count == 0) {
                numOfBSS++;
            }
        }

        return numOfBSS;
    }
}
