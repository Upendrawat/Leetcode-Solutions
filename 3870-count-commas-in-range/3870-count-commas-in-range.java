class Solution {
    public int countCommas(int n) {
        if(n<1000){
            return 0;
        }
        int count = 0;
        String str = Integer.toString(n);
        int c = 0;
        for(int i=str.length()-1; i>=0; i--){
            c++;
            if(c==3 && i != 0){
                count++;
                c=0;
            }
        }
        int diff = n-1000+1;
        int total_count = diff * count;
        return total_count;
    }
}