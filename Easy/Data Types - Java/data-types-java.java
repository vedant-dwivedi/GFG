//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends
class Geeks{
    static void dataTypes(int a, float b, double c, long l, byte d){
        double p = (double)c/b;
        double q = (float)b/a;
        double r = (double)c/a;
        double m = r+l;
        int s = (int)a/d;
        System.out.println(p + " " + q + " " + r + " " + m + " " + s);
    }
}

//{ Driver Code Starts.

class GFG {
    // Driver code
	public static void main (String[] args) {
	    
	    // Input using Scanner class
	    Scanner sc = new Scanner(System.in);
		int a;
		float b;
		double c;
		long l;
		byte d;
		
		//Taking input number of testcases 
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    //taking input all the different datatypes in their respective variables
		    a = sc.nextInt();
		    b = sc.nextFloat();
		    c = sc.nextDouble();
		    l = sc.nextLong();
		    d = sc.nextByte();
		    
		    //Creating an object of class Geeks
		    Geeks g = new Geeks();
		    
		    //Calling dataTypes method of class Geeks
		    g.dataTypes(a, b, c, l, d);
		}
	}
}
// } Driver Code Ends