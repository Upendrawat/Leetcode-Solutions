class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        
        for(int num : nums1){
            hs.add(num);
        }

        int pos = 0;

        for(int num : nums2){
            if(hs.remove(num)){
                nums1[pos++] = num;
            }
        }
        return Arrays.copyOf(nums1, pos);

    }
}