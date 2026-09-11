class Solution {
    public int trap(int[] height) {
        int[] max = new int[height.length];
        int max_left = height[0];
        int total_store = 0;
        for(int i=height.length-1;i>=0; i--){
            if(i == height.length-1) max[i] = height[i];
            else max[i] = Math.max(height[i], max[i+1]);
        }

        for(int i=1; i<height.length-1; i++){
            max_left = Math.max(max_left, height[i-1]);
            int store = Math.min(max_left, max[i+1]) - height[i];
            if(store > 0){
                total_store += store;
            }
        }
        return total_store;
    }
}