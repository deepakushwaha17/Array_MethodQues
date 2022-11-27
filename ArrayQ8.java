//Java Program to copy all elements of one array into another array 
import java.util.*;
public class ArrayQ8 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array length:");
        int n=sc.nextInt();
        int arr[] = new int[n];
        int arr2[]=new int[n];
        System.out.println("Enter the array element:");
        //loop to intialize array element
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        //loop to copy the array element in other array
        for(int i=0;i<n;i++)
        {
            arr2[i]=arr[i];
        }
        //loop to print the copied array
        System.out.println("Copied array elements are:");
        for(int i=0;i<n;i++)
        {
           System.out.print(arr2[i]+" "); 
        }
    }   
}
