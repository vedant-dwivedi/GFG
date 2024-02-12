//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.sequence(N));
        }
    }
}
// } Driver Code Ends



//User function Template for Java
class Solution {
    static long sequence(int n) {
        long MOD = 1000000007;
        long x = 1, ans = 0;

        // Loop through each number in the sequence
        for (int i = 1; i <= n; ++i) {
            long temp = 1;

            // Calculate the product of x in each iteration 
            for (int j = 1; j <= i; ++j) {
                temp = (temp * x) % MOD;
                ++x;
            }

            // Add the product to the sum
            ans = (ans + temp) % MOD;
        }

        // Return the sum of the sequence
        return ans;
    }
}
