//Java Program to print the elements of an array present on even position
import java.util.*;
public class ArrayQ13 
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
      //loop to print the array element present on even position
      System.out.println("Array elements  present on even position are : ");
      for(int i=0;i<n;i+=2)
      {
          System.out.print(arr[i]+" ");
      }
    }
}
