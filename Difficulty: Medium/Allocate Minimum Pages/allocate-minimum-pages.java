
//Back-end complete function Template for Java

class Solution {
    public static int findPages(int[] arr, int k) {
        // code here
        int len=arr.length;
        if(k>len) return -1;
        int low=0,high=0;
        for(int i=0;i<len;i++){
            low=Math.max(arr[i],low);
            high+=arr[i];
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(totalStudents(arr,mid)>k) low=mid+1;
            else high=mid-1;
        }
        return low;
    }
    
    public static int totalStudents(int arr[],int val){
        int cnt=1;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]<=val)
                sum+=arr[i];
            else{
                sum=arr[i];
                cnt++;
            }
        }
        return cnt;
    }
}