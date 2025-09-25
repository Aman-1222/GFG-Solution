class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        HashMap<Long,Long> map = new HashMap<>();
        long xor=0;
        long cnt=0;
        map.put(0L,1L);
        for(int i=0;i<arr.length;i++){
            xor=xor^arr[i];
            long x=xor^k;
            if(map.containsKey(x)) cnt+=map.get(x);
            map.put(xor,map.getOrDefault(xor,0L)+1);
        }
        return cnt;
    }
}