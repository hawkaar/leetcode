package src;

/**
 * LongestCommonPrefix
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String strs[] = { "flower", "flow", "flight", "flee" };

        // System.out.println(strs[0].indexOf("fl"));

        System.out.println(longestCommonPrefix(strs));
    }
    // Approach 1: Horizontal scanning
    // Time complexity : O(S)
    // Space complexity : O(1)

    public static String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) return "";
    String prefix = strs[0];
    for (int i = 1; i < strs.length; i++)
    while (strs[i].indexOf(prefix) != 0) {
    prefix = prefix.substring(0, prefix.length() - 1);
    if (prefix.isEmpty()) return "";
    }
    return prefix;
    }

    // -----------------------------------------------------------------------------------
    // Approach 2: Vertical scanning
    // Time complexity : O(S)
    // Space complexity : O(1)
    // public static String longestCommonPrefix(String[] strs) {
    // if (strs == null || strs.length == 0) return "";

    // for (int i = 0; i < strs[0].length() ; i++){
    // char c = strs[0].charAt(i);
    // for (int j = 1; j < strs.length; j ++) {
    // if (i == strs[j].length() || strs[j].charAt(i) != c)
    // return strs[0].substring(0, i);
    // }
    // }
    // return strs[0];
    // }

    // ----------------------------------------------------------
    // Approach 3: Divide and conquer
    // Time complexity : O(S)
    // Space complexity : O(m⋅logn)
    // public static String longestCommonPrefix(String[] strs) {
    // if (strs == null || strs.length == 0)
    // return "";
    // return longestCommonPrefix(strs, 0, strs.length - 1);
    // }

    // private static String longestCommonPrefix(String[] strs, int l, int r) {
    // if (l == r) {
    // return strs[l];
    // } else {
    // int mid = (l + r) / 2;
    // String lcpLeft = longestCommonPrefix(strs, l, mid);
    // String lcpRight = longestCommonPrefix(strs, mid + 1, r);
    // return commonPrefix(lcpLeft, lcpRight);
    // }
    // }

    // static String commonPrefix(String left, String right) {
    // int min = Math.min(left.length(), right.length());
    // for (int i = 0; i < min; i++) {
    // if (left.charAt(i) != right.charAt(i))
    // return left.substring(0, i);
    // }
    // return left.substring(0, min);
    // }

    // ------------------------------------------------------------------------

    // Approach 4: Binary search
    // Time complexity : O(S⋅logm)
    // Space complexity : O(1)
    // public static String longestCommonPrefix(String[] strs) {
    //     if (strs == null || strs.length == 0)
    //         return "";
    //     int minLen = Integer.MAX_VALUE;
    //     for (String str : strs)
    //         minLen = Math.min(minLen, str.length());
    //     int low = 1;
    //     int high = minLen;
    //     while (low <= high) {
    //         int middle = (low + high) / 2;
    //         if (isCommonPrefix(strs, middle))
    //             low = middle + 1;
    //         else
    //             high = middle - 1;
    //     }
    //     return strs[0].substring(0, (low + high) / 2);
    // }

    // private static boolean isCommonPrefix(String[] strs, int len) {
    //     String str1 = strs[0].substring(0, len);
    //     for (int i = 1; i < strs.length; i++)
    //         if (!strs[i].startsWith(str1))
    //             return false;
    //     return true;
    // }

//-----------------------------------------------------------------------------


}