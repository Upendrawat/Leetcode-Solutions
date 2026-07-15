class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        int product = 1;
        int productWithoutZero = 1;
        int zeroCount = 0;

        // First pass
        for (int num : nums) {

            if (num == 0) {
                zeroCount++;
            } else {
                product *= num;
                productWithoutZero *= num;
            }
        }

        // Case 1 : More than one zero
        if (zeroCount > 1) {
            return ans;          // phla se hi array mein sara zero fill honga
        }

        // Case 2 : Exactly one zero
        if (zeroCount == 1) {

            for (int i = 0; i < n; i++) {
                if (nums[i] == 0) {
                    ans[i] = productWithoutZero;
                }
            }

            return ans;
        }

        // Case 3 : No zero
        for (int i = 0; i < n; i++) {
            ans[i] = product / nums[i];
        }

        return ans;
    }
}