package pond.shore;

public class BirdWatcher {

    public static void main(String[] args) {
        watchBird();
    }

    public static void watchBird(){
        Bird bird = new Bird();
        bird.floatInWater();
        System.out.println(bird.text);
    }
}
