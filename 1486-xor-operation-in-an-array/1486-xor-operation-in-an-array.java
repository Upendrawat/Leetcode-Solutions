class Solution {
    public int xorOperation(int n, int start) {
        int[] arr = new int[n];
        int num = 0;
        for(int i=0; i<n;i++){
            arr[i] = start + 2 * i;
            num ^= arr[i];
        }
        return num;
    }
}