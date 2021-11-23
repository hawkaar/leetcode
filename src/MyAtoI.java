package src;

public class MyAtoI {
    public static void main(String[] args) {
        String s = "-214748365";

        System.out.println(myAtoi(s));
    }

    private static int myAtoi(String s) {
        int result = 0;
        boolean isNegative = false;
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
            isNegative = true;
            i++;
        }else if(s.charAt(i) == '+'){
            i++;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {


            int cValue = Character.getNumericValue(s.charAt(i));
            if (isNegative) {
                if(result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE/10 && cValue > 8)) return Integer.MIN_VALUE;
            } else {
                if(result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE/10 && cValue > 7)) return Integer.MAX_VALUE;
            }

            result = (result * 10) + cValue;
            i++;
            
            
        }

        return isNegative ? result * -1 : result;
    }
}
