//{ Driver Code Starts
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i=0; i<n; i++)
				a[i] = sc.nextInt();
			Solution ob = new Solution();
			System.out.println(ob.findMaxDiff(a,n));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    int findMaxDiff(int a[], int n)
    {
	   	int ls[]=new int[n];
	   	int ans=0;
	   	Stack<Integer> s1=new Stack();
	   	for(int i=0;i<n;i++){
	   	    while(!s1.isEmpty() && s1.peek()>=a[i]){
	   	         s1.pop();
	   	    }
	   	          if(s1.isEmpty()){
	   	              ls[i]=0;
	   	          }
	   	          else{
	   	              ls[i]=s1.peek();
	   	          }
	   	          s1.push(a[i]);
	   	}
	   	s1.clear();
	   	
	   	for(int i=n-1;i>=0;i--){
	   	    while(!s1.isEmpty() && s1.peek()>=a[i]){
	   	        s1.pop();
	   	    }
	   	    int x=0;
	   	    if(!s1.isEmpty()){
	   	         x=s1.peek();
	   	    }
	   	    
	   	    ans=Math.max(ans,Math.abs(ls[i]-x));
	   	    s1.push(a[i]);
	   	}
	   	return ans;
    }
}
