
class Solution {
    public void reverse(int[] nums,int left,int right)
    {
        int n=nums.length;
        while(left < right)
        {
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
    }
    }
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
