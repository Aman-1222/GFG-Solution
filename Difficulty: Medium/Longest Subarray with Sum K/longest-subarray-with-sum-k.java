//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim()); // Read number of test cases

        while (t-- > 0) {
            String line = read.readLine().trim(); // Read the array input
            String[] numsStr = line.split(" ");   // Split the input string by spaces
            int[] nums =
                new int[numsStr.length]; // Convert string array to integer array
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            int k = Integer.parseInt(read.readLine().trim()); // Read target sum

            Solution ob = new Solution();
            int ans = ob.longestSubarray(nums, k); // Call the function and store result
            System.out.println(ans);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int maxLen = 0;
        long x=0;
        long sum =0L ;
        HashMap<Long,Integer> map=new HashMap<>();
        map.put(0L,-1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            x=sum-k;
            if(map.containsKey(x))
                maxLen = Math.max(maxLen,i-map.get(x));
            if(!map.containsKey(sum))
                map.put(sum,i);
        }
        return maxLen;
    }
}
