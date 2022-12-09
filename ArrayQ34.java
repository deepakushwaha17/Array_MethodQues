//Java Program to find the frequency of odd & even numbers in the given matrix
import java.util.*;
public class ArrayQ34 
{
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the row and column:");
      int m=sc.nextInt();
      int n=sc.nextInt();
      int even=0,odd=0;
      int arr[][] = new int[m][n];
      System.out.println("Enter the matrix:");
      //loop to intialize matrix element
      for(int i=0;i<m;i++)
      {
          for(int j=0;j<n;j++)
          {
            arr[i][j]=sc.nextInt();
          }
      }

      //loop to count even & odd elements
      for(int i=0;i<m;i++)
      {
          for(int j=0;j<n;j++)
          {
            if(arr[i][j]%2==0)
              even++;
            else
              odd++; 
          }
      }
      System.out.println("Total Even Elements are:"+even); 
      System.out.println("Total Odd Elements are:"+odd);         
    }
}
