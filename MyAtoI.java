public class MyAtoI {
    public static void main(String[] args) {
        String s = "-214748365";

        System.out.println(myAtoi(s));
    }

    private static int myAtoi(String s) {
        int num = 0;
        boolean neg = false;
        int i = 0;
        
        if (s.isEmpty()) {
            return 0;
        }
        while(i < s.length() && s.charAt(i) == ' '){
            i++;
        }

        if(i >= s.length()){
            return 0;
        }

        if (s.charAt(i) == '-') {
            neg = true;
            i++;
        }else if(s.charAt(i) == '+'){
            i++;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {


            int cValue = Character.getNumericValue(s.charAt(i));
            if (neg) {
                if(num > Integer.MAX_VALUE/10 || (num == Integer.MAX_VALUE/10 && cValue > 8)) return Integer.MIN_VALUE;
            } else {
                if(num > Integer.MAX_VALUE/10 || (num == Integer.MAX_VALUE/10 && cValue > 7)) return Integer.MAX_VALUE;
            }

            num = (num * 10) + cValue;
            i++;
            
            
        }

        return neg ? num * -1 : num;
    }
}
