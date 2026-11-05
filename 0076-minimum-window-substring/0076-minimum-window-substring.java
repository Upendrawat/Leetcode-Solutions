class Solution {
    public String minWindow(String s, String t) {
        if(t.length() == 0 || s.length() < t.length()) return "";

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        int minLen = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int matched = 0;
        int startIndex = left;
        HashMap<Character,Integer> window = new HashMap<>();
        while(right < s.length()){
            char ch = s.charAt(right);
            if(map.containsKey(ch)){
                window.put(ch,window.getOrDefault(ch,0)+1);
                if(window.get(ch).equals(map.get(ch))){
                    matched++;
                }
            }

            while(matched == map.size()){
                    int len = right-left+1;
                    if(len < minLen){
                        minLen = len;
                        startIndex = left;
                    }
                    char leftChar = s.charAt(left);
                    if(map.containsKey(leftChar)){
                        window.put(leftChar, window.get(leftChar)-1);
                        if(window.get(leftChar) < map.get(leftChar)){
                            matched--;
                        }
                    }
                    left++;
            }
            right++;
        }
        if(minLen == Integer.MAX_VALUE){
            return "";
        }
        return s.substring(startIndex, startIndex+minLen);
    }
}