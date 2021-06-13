public class NumberPalindrom {
    public static void main(String[] args) {
        int x = -12321;

        System.out.println(checkNumberPalindrom(x));
    }

    private static boolean checkNumberPalindrom(int x) {

        String s = x + "";
        int end = s.length() - 1;
        boolean isPal = false;
        if (x < 0) {
            return isPal;
        }

       for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(end--)) {
                isPal = true;
            }else{
                return false;
            }
       }
        return isPal;
    }
}
