//Java Program to print Transpose matrix
import java.util.*;
public class ArrayQ29 
{
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the row and column:");
      int m=sc.nextInt();
      int n=sc.nextInt();
      int arr[][] = new int[m][n];
      System.out.println("Enter the array element:");
      //loop to intialize matrix element
      for(int i=0;i<m;i++)
      {
          for(int j=0;j<n;j++)
          {
            arr[i][j]=sc.nextInt();
          }
      }
      //loop to print the transpose matrix
      System.out.println("Transpose Matrix is : ");
      for(int i=0;i<n;i++)
      {
          for(int j=0;j<m;j++)
          {
            System.out.print(arr[j][i]+" ");
          }
          System.out.println();
      }
    }
}
