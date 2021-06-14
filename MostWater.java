public class MostWater {
    public static void main(String[] args) {
        int height[] = new int[] {1,8,6,2,5,4,8,3,7};

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
                begin++;
            }else{
                end--;
            }
        }


        return maxArea;
    }
}
