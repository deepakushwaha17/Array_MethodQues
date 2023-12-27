//Java Program to print the largest element in an array

import java.util.*;
public class ArrayQ15 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array length:");
        int n=sc.nextInt();
        int arr[] = new int[n];
        int largest = arr[0];
        System.out.println("Enter the array element:");
        //loop to intialize array element
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
       //loop to find largest element  
        for (int i=0;i<n; i++) 
        {  
           if(arr[i]>largest)  
               largest=arr[i];  
        }  
        System.out.println("Largest element present in given array is: " + largest);  
    }   
}
 
