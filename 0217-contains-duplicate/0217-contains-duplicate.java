class Solution {
    public boolean containsDuplicate(int[] nums) {

        // In hashmap it is majorly used for frequensy storing index or value with index for this we can use hashset that is mainly used for the unique element or the duplicate elements


        // HashMap<Integer,Integer> hp = new HashMap<>();

        // for(int i=0; i<nums.length; i++){
        //     hp.put(nums[i] , hp.getOrDefault(nums[i],0)+1);
        // }

        // for(Integer num : hp.values()){
        //     if(num > 1){
        //         return true;
        //     }
        // }
        // return false;

        // METHOD 2 using hashset
        HashSet<Integer> hs = new HashSet<>();
        for(int num : nums){
            if(hs.contains(num)){
                return true;
            }
            hs.add(num);
        }
        return false;
    }
}