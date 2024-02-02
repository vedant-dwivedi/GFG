//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S1 = read.readLine();
            String S2 = read.readLine();
            Solution ob = new Solution();

            System.out.println(ob.conRevstr(S1, S2));
        }
    }
}

// } Driver Code Ends

// User function template for Java

class Solution {
    static String conRevstr(String S1, String S2) {
        // code here
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        for(int i=0;i<S1.length();i++){
            sb.append(S1.charAt(i));
        }
        for(int i=0;i<S2.length();i++){
            sb.append(S2.charAt(i));
        }
        //sb.reverse();
        
        for(int i=sb.length()-1;i>=0;i--) {
            sb1.append(sb.charAt(i));
        }
        return sb1.toString();
    }
}