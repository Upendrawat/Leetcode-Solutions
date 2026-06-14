class Solution {
    public boolean isPalindrome(String s) {
        // if(s.isEmpty()) return true;
        // s = s.toLowerCase();
        // StringBuilder p = new StringBuilder();
        // int n = s.length();
        // for(int i=0; i<n; i++){
        //    if(Character.isLetterOrDigit(s.charAt(i))){
        //     p.append(s.charAt(i));
        //    }
        // }
        // if(p.isEmpty()) return true;
        // n = p.length();
        // for(int i=0; i<n/2; i++){
        //     if(p.charAt(i) != p.charAt(n-i-1)) return false;
        // }
        // return true;

        if(s.isEmpty()) return true;
        s = s.toLowerCase();
        int left = 0, right = s.length()-1;
        while(left < right){
            while(!Character.isLetterOrDigit(s.charAt(left))  && left<right){
                left++;
            }
            while(!Character.isLetterOrDigit(s.charAt(right)) && left<right){
                right--;
            }
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}