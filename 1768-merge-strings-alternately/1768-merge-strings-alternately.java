class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int w1 = 0;
        int w2 = 0;
        boolean check= true;
        while(w1 < word1.length() && w2 < word2.length()){
            if(check){
                sb.append(word1.charAt(w1++));
                check = false;
            }
            else{
                sb.append(word2.charAt(w2++));
                check = true;
            }
        }
        while(w1 < word1.length()){
            sb.append(word1.charAt(w1++));
        }
        while(w2 < word2.length()){
            sb.append(word2.charAt(w2++));
        }
        return sb.toString();
    }
}