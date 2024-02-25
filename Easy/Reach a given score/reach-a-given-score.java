//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t > 0)
        {
            int n = in.nextInt();
            Geeks obj = new Geeks();
            System.out.println(obj.count(n));
            t--;
        }
    }
}
// } Driver Code Ends


class Geeks {
    public long count(int n) {
        
        int arr[] = new int[]{3,5,10};
        long dp[][] = new long[arr.length+1][n+1];
        
        dp[0][0] = 1;
        
        for(int i=0;i<=arr.length;i++){
            for(int j=0;j<=n;j++){
                if(i==0 && j==0){
                    continue;
                }else if(i == 0 && j>i){
                    dp[i][j] = 0;
                }else if(arr[i-1]>j){
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j] //exclude the current
                                    + dp[i][j-arr[i-1]];///include the item
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }

}