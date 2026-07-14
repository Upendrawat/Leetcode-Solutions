import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        HashSet<Integer> hs = new HashSet<>();

        for (int num : nums) {
            hs.add(num);
        }

        int maxCount = 0;

        for (int num : hs) {

            // Start only if this is the beginning of a sequence
            if (!hs.contains(num - 1)) {

                int current = num;
                int count = 1;

                while (current != Integer.MAX_VALUE && hs.contains(current + 1)) {
                    current++;
                    count++;
                }

                maxCount = Math.max(maxCount, count);
            }
        }

        return maxCount;
    }
}