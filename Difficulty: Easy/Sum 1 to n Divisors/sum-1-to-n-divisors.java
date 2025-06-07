class Solution {
    public static long sumOfDivisors(long n) {
        // code here
        long ans=0L;
        for(int i=1;i<=n;i++){
            ans+=(n/i)*i;
        }
        return ans;
    }
}