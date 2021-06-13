public class MyAtToI {
    public static void main(String[] args) {
        String s = "       -42";

        
        System.out.println(myAtToi(s));
    }

    private static int myAtToi(String s) {
        char[] chars = s.toCharArray();
        int length = s.length();
        int num = 0;
        boolean neg = false;
        for (char c : chars) {
            if (c == ' '){
                continue;
            }else if(Character.isDigit(c)){
                num = (num * 10) + c;
            }else if(c == '-'){
                neg = true;
            }else{
                break;
            }
        }
        return neg ? num *-1 : num;
    }
}
