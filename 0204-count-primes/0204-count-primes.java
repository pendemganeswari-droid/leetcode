class Solution {
    public int countPrimes(int n) {
        if(n<=2) {
             return 0;
        }
        int count=0;
            boolean[] isPrime=new boolean[n];
            Arrays.fill(isPrime,true);
            for(int k=2;k*k <=n;k++)
            {
                if(isPrime[k])
                {
                    for(int j=k*k;j<n;j=j+k){
                     isPrime[j]=false;
                }
            }
            }
            for( int i=2;i<n;i++){
                if(isPrime[i]){
                    count++;
                }
            }
            return count;
    }
}