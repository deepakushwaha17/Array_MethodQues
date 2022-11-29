//Java Program to print the elements of an array present on odd position.
import java.util.*;
public class ArrayQ14 
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
      //loop to print the array element present on odd position
      System.out.println("Array elements  present on odd position are : ");
      for(int i=0;i<n;i++)
      {
          if(i%2!=0) 
            System.out.print(arr[i]+" ");
      }
    }   
}
