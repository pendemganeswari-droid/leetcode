class Solution {
    public boolean check(int[] nums) {
        int break1=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>nums[(i+1)%n])
             ++break1;
             if(break1>1)
               return false;
        }
        return true;
    }
}