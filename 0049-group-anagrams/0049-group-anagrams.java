class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);

            List<String> list = hm.getOrDefault(str, new ArrayList<>());
            list.add(strs[i]);
            hm.put(str, list);
        }
        return new ArrayList<>(hm.values());
    }
}