class Solution {
    public boolean checkIfPangram(String sentence) {
        int n=sentence.length();
        for(char ch='a';ch<='z';ch++){
        int found=0;
        for(int i=0;i<n;i++)
        {
            if(ch==sentence.charAt(i)){
                 found=1;
                 break;
            }
        }

        if(found==0){
        return false; 
        }
        }
        return true;
    }
}