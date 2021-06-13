public class MyAtoI {
    public static void main(String[] args) {
        String s = "-91283472332";

        System.out.println(myAtoi(s));
    }

    private static int myAtoi(String s) {
        int num = 0;
        boolean neg = false;
        int i = 0;
        
        if (s.isEmpty()) {
            return 0;
        }
        while(s.charAt(i) == ' ' && i < s.length()){
            i++;
        }

        if(i >= s.length()){
            return 0;
        }

        if (s.charAt(i) == '-') {
            neg = true;
            i++;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            num = num * 10 + Character.getNumericValue(s.charAt(i));
            
            if (neg) {
                if (i !=s.length()-1 
                && 
                ((num * -1) < Integer.MIN_VALUE/10 
                || 
                ((num * -1) == Integer.MIN_VALUE/10 
                && 
                s.charAt(i+1) < 8))) {
                    return Integer.MIN_VALUE;
                }
            }else{
                if (i !=s.length()-1 
                && 
                (num < Integer.MAX_VALUE/10 
                || 
                (num == Integer.MAX_VALUE/10 
                && 
                s.charAt(i+1) < 7))) {
                    return Integer.MAX_VALUE;
                }
            }
            i++;
        }

        return neg ? num * -1 : num;
    }
}
