// Java Program to Multiply Two Matrices.
import java.util.*;
public class ArrayQ26 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("row and column of 1st matrix:");
        int m=sc.nextInt();                       //m=no.of row of 1st matrix
        int n=sc.nextInt();                      //n=no.of column of 1st matrix
        System.out.println("row and column of 2nd matrix:");
        int m2=n;
        System.out.println(m2);                 //m2=no.of row of 2nd matrix
        int n2=sc.nextInt();                   //n2=no.of column of 2nd matrix
        int a1[][]=new int[m][n];
        int a2[][]=new int[m2][n2];
        int mul[][]=new int[m][n2];
        int i,j,k;
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
        for(i=0;i<m2;i++)
        {
            for(j=0;j<n2;j++)
            {
               a2[i][j]=sc.nextInt();
            }
        }
        //to multiply a1 and a2 matrix
        for(i=0;i<m;i++)
        {
            for(j=0;j<n2;j++)
            {
                for(k=0;k<n;k++)
                {
                    mul[i][j]+=a1[i][k]*a2[k][j];
                }
                
            }
        } 
        //to print the multiplied matrix
        System.out.println("Multiply of a1 and a2 matrix is:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n2;j++)
            {
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        }
    }
}
