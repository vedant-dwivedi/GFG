//{ Driver Code Starts
//Initial Template for Java

// Java program to illustrate
// Generics
import java.io.*;
import java.util.Scanner;

class gfg
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
        int n=sc.nextInt();
        if(n==1)
        {
            String s=sc.next();
            GenericClass<String> Str=new GenericClass<String>(s);
            Str.showType();
        }
        else
        {
            Integer p=sc.nextInt();
            GenericClass<Integer> integer=new GenericClass<Integer>(p);
            integer.showType();
        }
        }
    }
}

// } Driver Code Ends
//User function Template for Java
class GenericClass<T> {
    private T value;
    //Constructor for GenericClass which takes a value of generic data type as input.
    public GenericClass(T value) {
        this.value = value;
    }
    //A method called showType() which prints the class name and value of the generic data type.
    public void showType() {
        System.out.println(value.getClass().getSimpleName());
        System.out.println(value);
    }
}

//{ Driver Code Starts.

// } Driver Code Ends