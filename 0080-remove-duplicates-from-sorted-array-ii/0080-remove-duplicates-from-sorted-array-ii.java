class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int pos = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1] && count <2){
                nums[pos++] = nums[i];
                count++;
            }
            else if(nums[i] != nums[i-1]){
                nums[pos++] = nums[i];
                count = 1;

            }
        }
        return pos;
    }
}