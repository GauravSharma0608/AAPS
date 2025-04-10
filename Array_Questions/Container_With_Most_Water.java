public class Container_With_Most_Water {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        Container_With_Most_Water obj = new Container_With_Most_Water();

        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = obj.maxArea(height);

        System.out.println("Maximum water that can be contained: " + result);
    }
}