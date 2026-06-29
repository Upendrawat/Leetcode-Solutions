class Solution {
    public int[] runningSum(int[] nums) {

        // METHOD 1
        // int[] RunningSum = new int[nums.length];
        // int  sum = 0; 
        // for(int i=0;i<nums.length;i++){
        //     sum += nums[i];
        //     RunningSum[i] = sum;
        // }
        // return RunningSum;

        // METHOD 2 replacing in that same array
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}