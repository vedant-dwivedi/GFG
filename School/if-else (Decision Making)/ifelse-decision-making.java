//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0)
        {
            int n = scn.nextInt();
            int m = scn.nextInt();
            Solution ob = new Solution();
            String ans = ob.compareNM(n,m);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends



//User function Template for Java
class Solution{
    static String compareNM(int N,int M){
        // code here
        if(N>M){
            return "greater";
        }else if(N<M){
            return "lesser";
        }
        return "equal";
    }
}