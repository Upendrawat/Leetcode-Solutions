class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if(s.length() < p.length()){
            return result;
        }

        int[] arr = new int[26];
        int[] arr2 = new int[26];

        for(int i=0; i<p.length(); i++){
            arr[p.charAt(i) - 'a']++;
        }

        int window_size = p.length();

        for(int i=0; i<window_size; i++){
            arr2[s.charAt(i) - 'a']++;
        }

        if(Arrays.equals(arr, arr2)){
            result.add(0);
        }

        for(int right = window_size; right<s.length(); right++){
            arr2[s.charAt(right)-'a']++;

            int left = right - window_size;
            arr2[s.charAt(left)-'a']--;

            if(Arrays.equals(arr,arr2)){
                result.add(left+1);
            }

        }
        return result;
    }
}