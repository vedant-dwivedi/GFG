//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s, patt;
            s = sc.next();
            patt = sc.next();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.search(patt, s);
            
            for(int i = 0;i<res.size();i++)
                System.out.print(res.get(i) + " ");
            System.out.println();    
        }
    }
}
// } Driver Code Ends


class Solution
{
    
    ArrayList<Integer> search(String pattern, String text)
    {
        // your code here
        char textArr[] = text.toCharArray();
        char patternArr[] = pattern.toCharArray();
        int i = 0; //to traverse the text
        int j = 0; //to traverse the 
        int ind = 1; //to add index in list
        int m = patternArr.length; //size of pattern
        int n = textArr.length; //size of text
        int flag = 0;
        ArrayList<Integer> al = new ArrayList<>(); //to store result
        while(i<n){
            if(textArr[i] == patternArr[0]){
                ind = i+1;
                while(j<m && i <n && textArr[i] == patternArr[j]){
                    i++;
                    j++;
                }
                if(j == m)
                    al.add(ind);
                i = ind;
                j = 0;
            }else
                i++;
        }
        return al;
    }
}
