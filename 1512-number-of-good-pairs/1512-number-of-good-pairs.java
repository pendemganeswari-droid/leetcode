class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        HashMap<Integer,Integer>hm=new HashMap<>();
        int count=0;
       for(int i=0;i<nums.length;i++){
           int freq = hm.getOrDefault(nums[i], 0);
        
            count+=freq;
         hm.put(nums[i],freq+1);
       }
       return count;
    }
}