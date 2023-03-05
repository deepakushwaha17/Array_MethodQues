//Java Program to print the duplicate elements of an array
import java.util.*;
public class ArrayQ10 
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
      //loop to print duplicte element
      System.out.println("Duplicate elements of array are: ");
      for(int i=0;i<n;i++)
      {
          for(int j=i+1;j<n;j++)
          {
            if(arr[i]==arr[j])
             System.out.println(arr[i]) ;
          }

      }
   } 
}

