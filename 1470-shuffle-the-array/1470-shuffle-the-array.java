class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        int left = 0; int right = n;
        int pos=0;
        boolean check = true;
        while( pos < nums.length){
            if(check){
                arr[pos++] = nums[left++];
                check = false;
            }
            else{
                arr[pos++] = nums[right++];
                check = true;
            }
        }
        return arr;
    }
}