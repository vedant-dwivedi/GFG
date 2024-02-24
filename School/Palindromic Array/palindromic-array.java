//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends

class GfG
{
public static int palinArray(int[] a, int n)
           {
                  //add code here.
            for (int i = 0; i < n; i++) {
            if (!isPalindrome(a[i]))
                return 0;
        }
        return 1;
           }
    public static boolean isPalindrome(int num) 
    {
       int original = num;
        int reverse = 0;
 
        while (num != 0) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }
 
        return original == reverse;
        
    }
}
