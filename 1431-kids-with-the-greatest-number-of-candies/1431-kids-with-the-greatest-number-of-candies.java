class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandi=Integer.MIN_VALUE;
        for(var ele : candies){
        if(ele > maxCandi){
        maxCandi=ele;
        }
        }
    List<Boolean>res=new ArrayList<>();
    for(var ele : candies){
       res.add(ele + extraCandies >= maxCandi);
        
    }
    return res;
}
}