//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String St[] = read.readLine().split(" ");
            
            int N = Integer.parseInt(St[0]);
            int K = Integer.parseInt(St[1]);
            
            String S[] = read.readLine().split(" ");
            
            int[] arr = new int[N];
            
            for(int i=0 ; i<N ; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.splitArray(arr,N,K));
        }
    }
}
// } Driver Code Ends


class Solution {
    public static int fun(int[] arr,int k)
    {
        int c=1,s=0;
        for(int i=0;i<arr.length;i++)
        {
            if(s+arr[i]<=k)
            s+=arr[i];
            else{
                c++;
                s=arr[i];
            }
        }
        return c;
    }
    static int splitArray(int[] arr , int N, int K) {
        // code here
        if(K>arr.length)
        return -1;
        
        int s=0,max=-1;
        for(int i=0;i<arr.length;i++)
        {
            s+=arr[i];
            max=Math.max(arr[i],max);
        }
        
        int low=max,high=s;
        
        while(low<=high)
        {
            int mid=(low+high)/2;
            int no_subarrays=fun(arr,mid);
            if(no_subarrays>K)
            low=mid+1;
            else
            high=mid-1;
        }
        return low;
    }
};
