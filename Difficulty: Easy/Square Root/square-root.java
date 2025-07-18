class Solution {
    int floorSqrt(int n) {
        // code here
        int low=1,high=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid*mid==n) return mid;
            else if(mid*mid>n) high=mid-1;
            else low=mid+1;
        }
        return high;
    }
}