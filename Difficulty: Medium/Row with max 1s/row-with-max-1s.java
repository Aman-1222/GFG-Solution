// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int ans=-1;
        int i=arr[0].length-1;
        int j=0;
        while(i>=0 && j<=arr.length-1){
            if(arr[j][i]==1){
                ans=j;
                i--;
            }
            else j++;
        }
        return ans;
    }
}