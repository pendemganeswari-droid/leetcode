class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
         Arrays.sort(intervals,(a,b) -> Integer.compare(a[1],b[1]));
         int currentEndTime=-50001,removalCount=0;
         for(var interval:intervals)
         if(interval[0]>=currentEndTime)
         currentEndTime=interval[1];
         else
         {
            removalCount++;
         }
         return removalCount;
    }
}