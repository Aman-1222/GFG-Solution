// User function Template for Java

class Solution {
    public int nthRoot(int n, int m) {
        // code here
        int low=1,high=m;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(n,mid,m)==1) return mid;
            else if(check(n,mid,m)==0) high=mid-1;
            else low=mid+1;
        }
        return -1;
    }
    
    public int check(int n,int num,int m){
        long ans=1;
        for(int i=0;i<n;i++){
            ans=ans*num;
            if(ans>(long)m) return 0;
        }
        if(ans==m) return 1;
        else return 2;
    }
}