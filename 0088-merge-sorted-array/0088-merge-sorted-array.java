class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums = new int[m+n];
        int n1 = 0;
        int n2 = 0;
        int k=0;
        while(n1<m && n2<n){
            if(nums1[n1] <= nums2[n2]){
                nums[k] = nums1[n1];
                n1++;
            }
            else{
                nums[k] = nums2[n2];
                n2++;
            }
            k++;
        }

        while(n1<m){
            nums[k] = nums1[n1];
            n1++;
            k++;
        }

        while(n2<n){
            nums[k++] = nums2[n2++];
        }
        
        for(int i=0; i<m+n; i++){
            nums1[i] = nums[i];
        }
    }
}