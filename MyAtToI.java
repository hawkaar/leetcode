public class MyAtToI {
    public static void main(String[] args) {
        String s = "-91283472332";

        System.out.println(myAtToi(s));
    }

    private static int myAtToi(String s) {
        char[] chars = s.toCharArray();
        int num = 0;
        boolean neg = false;
        for (char c : chars) {
            if (c == ' ') {
                continue;
            } else if (Character.isDigit(c)) {
                if (num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE / 10 && Character.getNumericValue(c) > 7)) 
                    return Integer.MAX_VALUE;
                if (num < Integer.MIN_VALUE / 10 || (num == Integer.MIN_VALUE / 10 && Character.getNumericValue(c) < -8)) 
                    return Integer.MIN_VALUE;
                num = (num * 10) + Character.getNumericValue(c);
                if (neg) {
                    num *= -1;
                    neg = false;
                }
            } else if (c == '-') {
                neg = true;;
            } else {
                break;
            }
        }
        return num;
    }
}
