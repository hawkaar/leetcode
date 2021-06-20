package src;
public class RomanToInt {
    public static void main(String[] args) {
        String s = "MCMXCIV";

        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        int length = s.length();
        int digits = 0;

        for (int i = 0; i < length; i++) {
            switch (s.charAt(i)) {

                case 'I':
                    if (i != length - 1 && s.charAt(i + 1) == 'V') { // 'IV' == 4
                        digits += 4;
                        i++;
                        break;
                    } else if (i != length - 1 && s.charAt(i + 1) == 'X') { // 'IX' == 9
                        digits += 9;
                        i++;
                        break;
                    } else
                        digits++; // 'I' == 1
                    break;

                case 'V':
                    digits += 5; // 'V' == 5
                    break;

                case 'X':
                    if (i != length - 1 && s.charAt(i + 1) == 'L') { // 'XL' == 40
                        digits += 40;
                        i++;
                        break;
                    } else if (i != length - 1 && s.charAt(i + 1) == 'C') { // 'XC' == 90
                        digits += 90;
                        i++;
                        break;
                    } else
                        digits += 10; // 'X' == 10
                    break;

                case 'L':
                    digits += 50; // 'L' == 50
                    break;

                case 'C':
                    if (i != length - 1 && s.charAt(i + 1) == 'D') { // 'CD' == 400
                        digits += 400;
                        i++;
                        break;
                    } else if (i != length - 1 && s.charAt(i + 1) == 'M') { // 'CM' == 900
                        digits += 900;
                        i++;
                        break;
                    } else
                        digits += 100; // 'C' == 100
                    break;

                case 'D':
                    digits += 500; // 'D' == 500
                    break;
                case 'M':
                    digits += 1000; // 'M' == 1000
                default:
                    break;
            }
        }
        return digits;
    }
}
