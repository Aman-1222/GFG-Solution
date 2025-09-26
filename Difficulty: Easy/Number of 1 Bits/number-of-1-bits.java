// User function Template for Java
class Solution {
    static int setBits(int n) {
        // code here
        int cnt=0;
        while(n>0){
            if(n%2!=0) cnt++;
            n/=2;
        }
        return cnt;
    }
}