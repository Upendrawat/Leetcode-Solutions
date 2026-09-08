class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int mid = 0;
        int right = nums.length-1;
        while(left <= mid && right >= mid){
            if(nums[mid] == 1){
               mid++;
            }
            else if(nums[mid] == 0){
                nums[mid] = nums[left];
                nums[left] = 0;
                left++;
                mid++;
            }
            else{
                nums[mid] = nums[right];
                nums[right] = 2;
                right--;
            }
        }
    }
}