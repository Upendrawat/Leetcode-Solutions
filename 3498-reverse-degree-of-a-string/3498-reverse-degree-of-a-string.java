class Solution {
    public int reverseDegree(String s) {
        int total = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int front = i + 1;
            int last = 123 - ch;
            total += front * last; 
        }
        return total;
    }
}