class Solution {
    int maxLength(int arr[]) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int ans=0;
        int prefix=0;
        for(int i=0;i<arr.length;i++){
            prefix+=arr[i];
            if(map.containsKey(prefix)) ans=Math.max(ans,i-map.get(prefix));
            if(!map.containsKey(prefix)) map.put(prefix,i);
        }
        return ans;
    }
}