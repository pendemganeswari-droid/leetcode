
class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int totalsum = 0;

        // Step 1: Calculate total sum
        for (int i = 0; i < n; i++) {
            totalsum += nums[i];
        }

        // Step 2: Calculate prefix sum
        int[] prefixsum = new int[n];
        prefixsum[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefixsum[i] = prefixsum[i - 1] + nums[i];
        }

        // Step 3: Find middle index
        for (int i = 0; i < n; i++) {
            int leftsum = (i == 0) ? 0 : prefixsum[i - 1];
            int rightsum = totalsum - prefixsum[i];

            if (leftsum == rightsum) {
                return i;
            }
        }

        return -1;
    }
}
