//{ Driver Code Starts
// Initial template for Java

import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();

            System.out.println(ob.delAlternate(S));
        }
    }
}
// } Driver Code Ends

// User function template for Java
class Solution {
    static String delAlternate(String S) {
        // code here
        String S2 = "";
        for(int i=0; i<S.length(); i++){
            if(i%2 == 1){
                continue;
            }
            S2 = S2 + S.charAt(i);
        }
        return S2;
    }
}