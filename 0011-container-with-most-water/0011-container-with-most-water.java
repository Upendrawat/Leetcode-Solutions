class Solution {
    public int maxArea(int[] height) {
        // brute force approach 
        int left = 0;
        int right = height.length -1;
        int max_store = 0;

        while(left<right){
            int width = right - left;
            int store = Math.min(height[left], height[right]) * width;
            if(store> max_store){
                max_store = store;
            }
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max_store;
    }
}