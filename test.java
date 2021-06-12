public class test {
    public static void main(String[] args) {

        String s = "eeeee";
        String res = longestPalindrome(s);//TODO @hawkar
        

        System.out.println(res);

    }

    private static String longestPalindrome(String s) {
        int length = s.length();
        int maxLength = 1;
        int start = 0, end = 1;

        if (s.isEmpty()) {
            maxLength = 0; // thisss
        }

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length + 1; j++) {
                if (isPal(s.substring(i, j))) {

                    if (maxLength < (j - i)) {
                        start = i;
                        end = j;
                        maxLength = j - i;
                    }
                }
            }
        }

        return s.substring(start, end);
    }

    private static boolean isPal(String s) {
        int start = 0;
        int end = s.length() - 1;
        boolean res = false;

        if (s.isEmpty()) {
            return false;
        }

        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        while (start <= end) {
            if (s.charAt(start++) == s.charAt(end--)) {
                res = true;
            } else
                return false;
        }
        return res;
    }

    // public static String longestPalindrome(String s) {
    // int length = s.length();
    // int maxLength = 1;
    // int start = 0, end = 1;

    // for(int i = 0; i< length; i++){
    // for(int j = i; j<length; j++){

    // int st=i;
    // int e = j;
    // boolean res = false;
    // if(s.charAt(st) != s.charAt(e)){
    // res = false;
    // }else{
    // while(st <= e){
    // if(s.charAt(st++) == s.charAt(e--)){
    // res = true;
    // }else{
    // res = false;
    // break;
    // }
    // }
    // }

    // if(res){
    // if(maxLength < (j-i+1)){
    // start = i;
    // end = j+1;
    // maxLength = j-i+1;
    // }
    // }
    // }
    // }
    // System.out.println(maxLength);
    // return s.substring(start, end);
    // }

}
