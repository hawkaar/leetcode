package src;
public class MostWater {
    public static void main(String[] args) {
        int height[] = new int[] {1,8,6,2,5,4,8,3,7};

        System.out.println(maxArea(height));
    }

    private static int maxArea(int[] height) {

        //initializing variables
        int begin = 0, end = height.length-1, maxWater = 0;

        //Continue until left pointer reaches right pointer
        while(begin < end){

            //determine if the new area is larger than the current area in 'maxArea'
            maxWater = Math.max(maxWater, (Math.min(height[begin], height[end]) * (end - begin)));

            //check for the smaller bar(number)
            //if the left pointer then increment
            //else decrement the right pointer
            if (height[begin] < height[end]) {
                begin++;
            }else{
                end--;
            }
        }


        return maxWater;
    }
}
