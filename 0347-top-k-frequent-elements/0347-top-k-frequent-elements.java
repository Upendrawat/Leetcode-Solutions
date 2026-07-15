class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr = new int[k];
        HashMap<Integer,Integer> hm = new HashMap<>();

        ArrayList<Map.Entry<Integer,Integer>> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            list.add(entry);
        }
        // or the another way instead of for loop i can directly use to list them in arraylist is 
        // list.addAll(hm.entrySet());

        Collections.sort(list, (a,b) -> b.getValue() - a.getValue());
        // if i write a.getValue() - b.getValue() then it will sort it in the ascending order

        for(int i=0; i<k; i++){
            arr[i] = list.get(i).getKey();
        }
        return arr;
    }
}