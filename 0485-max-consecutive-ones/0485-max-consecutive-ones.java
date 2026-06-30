class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_count = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                if(max_count < count){
                   max_count = count;
                }
                count = 0;
            }
            else{
                count++;
            }
        }
        if(max_count < count){
            max_count = count;
        }
        return max_count;
    }
}