import java.util.LinkedList;
import java.util.Queue;

public class IfTwoStringArrEquivalent {
    public static void main(String[] args) {
        String[] word1 = {"ab", "cd"};
        String[] word2 = {"a", "bc"};

        System.out.println(arrayStringsAreEqual(word1, word2));
    }


    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < word1.length; i++) {
            for (int j = 0; j < word1[i].length(); j++) {
                q.add(word1[i].charAt(j));
            }
        }

        for (int i = 0; i < word2.length; i++) {
            for (int j = 0; j < word2[i].length(); j++) {
                
                if (q.isEmpty()) {
                    System.out.println("Queue is empty");
                    return false;
                }

                char c = word2[i].charAt(j);
                char cInQueue = q.poll();
                if(c != cInQueue){
                    System.out.println("does not match");
                    return false;
                }
            }
        }

        if (!q.isEmpty()) {
            System.out.println("Queue is not empty");
            return false;
        }

        System.out.println("at the end");
        return true;
    }
}
