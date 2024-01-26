//Java Program to determine whether two matrices are equal.

import java.util.*;
public class ArrayQ32 
{
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the row and column:");
      int m=sc.nextInt();
      int n=sc.nextInt();
      boolean flag=true;
      int arr1[][] = new int[m][n];
      int arr2[][] = new int[m][n];
      System.out.println("Enter the matrix1:");
      //loop to intialize matrix1 element
      for(int i=0;i<m;i++)
      {
          for(int j=0;j<n;j++)
          {
            arr1[i][j]=sc.nextInt();
          }
      }

      System.out.println("Enter the matrix2:");
      //loop to intialize matrix2 element
      for(int i=0;i<m;i++)
      {
          for(int j=0;j<n;j++)
          {
            arr2[i][j]=sc.nextInt();
          }
      }
      //loop to check the matrices are equal or not
      for(int i=0;i<m;i++)
      {
          for(int j=0;j<n;j++)
          {
            if(arr1[i][j]!=arr2[i][j])
              flag=false;
              break;
          }
      }
      if(flag)
        System.out.println("Given matrices are equal");
        else
         System.out.println("Given matrices are not equal");
        
    }
}
