// User function Template for Java
class Solution {
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int len=stalls.length;
        int low=1,high=stalls[len-1];
        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(mid,stalls,k)) low=mid+1;
            else high=mid-1;
        }
        return high;
    }
    
    public static boolean possible(int dist,int stalls[],int k){
        int cnt_k=1;
        int last_dist=stalls[0];
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-last_dist>=dist){
                cnt_k++;
                last_dist=stalls[i];
            }
        }
        return (cnt_k>=k);
    }
}