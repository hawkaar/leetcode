import java.util.Arrays;

public class MostWater {
    public static void main(String[] args) {
        int height[] = new int[] {4,3,2,1,4};

        System.out.println(maxArea(height));
    }

    private static int maxArea(int[] height) {
        int begin = 0;
        int end = height.length-1;
        int maxArea = 0;

        while(begin < end){
            int newArea = Math.min(height[begin], height[end]) * (end - begin);
            if (newArea > maxArea) {
                maxArea = newArea;
            }

            if (height[begin] < height[end]) {
                
            }
        }


        return 0;
    }
}
