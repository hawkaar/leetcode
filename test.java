import java.util.Random;

public class test {
    public static void main(String[] args) {
        int luck = 10;
        if ((luck > 10 ? luck++ : --luck) < 10) {
            System.out.print("Bear");
        }
        if (luck < 10)
            System.out.print("Shark");
    }
}
