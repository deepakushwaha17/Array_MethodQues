//Java program to find whether an array is sorted or not.
import java.util.*;
public class ArrayQ7 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array length:");
        int n=sc.nextInt();
        int arr[] = new int[n];
        boolean flag=false;
        System.out.println("Enter the array element:");
        //loop to intialize array element
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        //loop to check array element is sorted or not.  
        for (int i=0;i<n-1; i++) 
        {  
            if(arr[i]<=arr[i+1])  
              flag=true;     
            else
              break; 
        }  
        if(flag==true) 
            System.out.println("Sorted Array");
        else
            System.out.println("Not Sorted Array");   
    }
}
