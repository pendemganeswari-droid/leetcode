
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] eA = new int[n];
        k = k % n;

        for (int i = 0, j = k; i < n - k; i++, j++) {
            eA[j] = nums[i];
        }

        for (int i = n - k, j = 0; i < n; i++, j++) {
            eA[j] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = eA[i];
        }
    }
}
