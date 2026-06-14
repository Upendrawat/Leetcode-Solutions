class Solution {
    public boolean isPalindrome(int x) {
        // if(x<0) return false;
        // int num=0;
        // int temp=x;
        // while(temp!=0){
        //     int rem = temp%10;
        //     num = num*10+rem;
        //     temp = temp/10;
        // }
        // if(x==num){
        //     return true;
        // }
        // return false;

        
        // another approach

        String s = String.valueOf(x);
        int n =s.length();

        for(int i=0; i<n/2; i++){
            if(s.charAt(i) != s.charAt(n-i-1)) return false;
        }
        return true;
    }
}