//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s = in.readLine();
            int k = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.minValue(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static int minValue(String s, int k){
         int arr[] = new int[26];
        for(int i=0; i< s.length(); i++){
            arr[s.charAt(i)-'a'] += 1;
        }
        Arrays.sort(arr);
        while(k>0){
            arr[25]--;
            Arrays.sort(arr);
            k--;
        }
        int ans=0;
        for(int i: arr){
            ans += (i*i);
        }
        return ans;
    }
}