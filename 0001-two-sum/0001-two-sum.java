class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer>hm=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        int nums2=target-nums[i];
        if(hm.containsKey(nums2)){
            return new int[]{i,hm.get(nums2)};
        }
         hm.put(nums[i], i);
       }
       return new int[]{};
    }
}