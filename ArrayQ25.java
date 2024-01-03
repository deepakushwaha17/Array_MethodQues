// Java Program to Add Two Matrices.

import java.util.*;
public class ArrayQ25 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row and column:");
        int m=sc.nextInt();                       //m=no.of row
        int n=sc.nextInt();                      //n=no.of column                            
        int a1[][]=new int[m][n];
        int a2[][]=new int[m][n];
        int sum[][]=new int[m][n];
        int i,j;
        //to enter a1 matrix element
        System.out.println("enter the a1 element:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a1[i][j]=sc.nextInt();
            }
        } 
        //to enter a2 matrix element
        System.out.println("enter the a2 element"); 
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
               a2[i][j]=sc.nextInt();
            }
        }
        //to sum th a1 and a2 matrix
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                sum[i][j]=a1[i][j]+a2[i][j];
            }
        } 
        //to print the sum matrix
        System.out.println("Sum of a1 and a2 matrix is:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }    
    }
}
