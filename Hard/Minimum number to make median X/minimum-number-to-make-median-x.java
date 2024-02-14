//{ Driver Code Starts
//Initial Template for Java


//Initial Template for Java

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends

//User function Template for Java

        

class Solution{
    
  
    int minimumAppend(int arr[], int n, int x)
    {
        // Complete the function
        int first = 0, second = 0, third = 0;
	        int minNumber = Integer.MIN_VALUE;
	        int maxNumber = Integer.MAX_VALUE;
	      for(int i = 0; i< n; i++){
	        if(arr[i] == x) {
	            first++;
	        } else if(arr[i] < x){
	            second++;
	            minNumber = Math.max(minNumber, arr[i]);
	        } else{
	            third++;
	            maxNumber = Math.min(maxNumber, arr[i]);
	        }
	    }
	       
	    int sum = 0;
	    if(n % 2 == 0){
	        sum = Math.abs(third -second) - first +1;
	        if(first!= 1 && minNumber + maxNumber == 2*x)
	            sum--;
	    } else {
	        if(first == 1 || minNumber + maxNumber == 2*x) {
	            sum = Math.abs(third - second);
	        } else if(minNumber + maxNumber > 2*x){
	            if(second < third) {
	                sum = third - second + 1;
	            } else {
	                sum = second - third;
	            }
	        }
	        else {
	            if(second < third) {
	                sum = third - second;
	            } else {
	                sum = second - third + 1;
	            }
	        }
	    }
	    return sum;
    }
  
    
}



//{ Driver Code Starts.

// Driver class
class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    
		    String line1 = br.readLine();
		    String[] element = line1.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    int K = Integer.parseInt(element[1]);
		    
		    int arr [] = new int[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Solution obj = new Solution();
		   
		    int res = obj.minimumAppend(arr, sizeOfArray, K);
		    
		    System.out.println(res);
		    
		    
		}
	}
}



// } Driver Code Ends