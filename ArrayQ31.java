//Java Program to determine whether a given matrix is a sparse matrix.
import java.util.*;
public class ArrayQ31 
{
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the row and column:");
      int m=sc.nextInt();
      int n=sc.nextInt();
      int count=0;
      double sp=(m*n)/2;
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
      //loop to check the matrix is sparse matrix or not
      for(int i=0;i<m;i++)
      {
          for(int j=0;j<n;j++)
          {
            if(arr[i][j]==0)
            count++;
          }
      }
      if(count>sp)
        System.out.println("Given matrix is sparse matrix");
        else
         System.out.println("Given matrix is not sparse matrix");
        
    }
}
