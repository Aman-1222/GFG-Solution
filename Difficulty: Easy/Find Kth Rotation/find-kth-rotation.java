// User function Template for Java

class Solution {
    public int findKRotation(List<Integer> arr) {
        // Code here
        int low =0, high=arr.size()-1;
        int min=Integer.MAX_VALUE;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr.get(low)<=arr.get(high)){
                if(arr.get(low)<min){
                    min=arr.get(low);
                    ans=low;
                }
                break;
            }
            if(arr.get(low)<=arr.get(mid)){
                if(arr.get(low)<min){
                    min=arr.get(low);
                    ans=low;
                }
                low=mid+1;
            }
            else{
                if(arr.get(mid)<min){
                    min=arr.get(mid);
                    ans=mid;
                }
                high=mid-1;
            }
        }
        return ans;
    }
}