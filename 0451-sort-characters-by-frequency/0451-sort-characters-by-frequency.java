class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        StringBuilder sb = new StringBuilder();
        while(!map.isEmpty()){
            char max_ch = ' ';
            int max = 0;
            for(Map.Entry<Character,Integer> entry : map.entrySet()){
                char ch = entry.getKey();
                int count = entry.getValue();
                if(count > max){
                    max_ch = entry.getKey();
                    max = count;
                }
            }
            for(int i=0; i<max; i++){
                sb.append(max_ch);
            }
            map.remove(max_ch);
        }

        return sb.toString();
    }
}