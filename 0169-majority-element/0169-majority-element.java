class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        int max_freq = 0;
        int max_freq_value = Integer.MIN_VALUE;
        for(Map.Entry<Integer, Integer> num : map.entrySet()){
            if(num.getValue() > max_freq){
                max_freq = num.getValue();
                max_freq_value = num.getKey();
            }
        }
        return max_freq_value;
    }
}