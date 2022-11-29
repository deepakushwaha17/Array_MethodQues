//Java Program to print the smallest element in an array
import java.util.*;
public class ArrayQ16 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array length:");
        int n=sc.nextInt();
        int arr[] = new int[n];
        int smallest= arr[0];
        System.out.println("Enter the array element:");
        //loop to intialize array element
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
       //loop to find smallest element  
        for (int i=0;i<n; i++) 
        {  
           if(arr[i]<smallest)  
               smallest=arr[i];  
        }  
        System.out.println("Smallest element present in given array is: " + smallest);  
    }   
}
 
