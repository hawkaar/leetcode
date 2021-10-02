public class NumberPalindrom {
    public static void main(String[] args) {
        int x = 12321;

        System.out.println(checkNumberPalindrom(x));
    }

    private static boolean checkNumberPalindrom(int x) {
        int copyofX = x;
        int revofX = 0;

        if(x < 0 ) return false;
        if(x < 10) return true;

        while (x != 0) {
            revofX *= 10;
            revofX = revofX +  (x % 10);
            x /= 10;
        }

        return copyofX == revofX;
    }
}
