//Java Program to print the elements of an array in reverse order

import java.util.*;
public class ArrayQ12 
{
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the array length:");
      int n=sc.nextInt();
      int arr[] = new int[n];
      System.out.println("Enter the array element:");
      //loop to intialize array element
      for(int i=0;i<n;i++)
      {
          arr[i]=sc.nextInt();
      }
      //loop to print the array element
      System.out.println("Array elements in reverse order are :");
      for(int i=n-1;i>=0;i--)
      {
          System.out.print(arr[i]+" ");
      }
    }
}
