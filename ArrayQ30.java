//Java Program to determine whether a given matrix is an identity matrix
import java.util.*;
public class ArrayQ30 
{
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the row and column:");
      int m=sc.nextInt();
      int n=sc.nextInt();
      int count=0;
      if(m!=n)
      { 
        System.out.println("Invalid  no. of row and column");
      }
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
      //loop to check the matrix is identity matrix or not
      for(int i=0;i<m;i++)
      {
          for(int j=0;j<n;j++)
          {
            if(i==j&&arr[i][j]==1)
            count++;
          }
      }
      if(count==m)
        System.out.println("Given matrix is identity matrix");
        else
         System.out.println("Given matrix is not identity matrix");
        
    }
}
