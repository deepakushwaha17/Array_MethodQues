//Create a Java program to add two matrices of size 2x3.
import java.util.*;
public class ArrayQ4 
{
    public static void main(String[] args) 
    {
        int a1[][]=new int[2][3];
        int a2[][]=new int[2][3];
        int sum[][]=new int[2][3];
        int i,j;
        Scanner sc=new Scanner(System.in);
        //to enter a1 matrix element
        System.out.println("enter the a1 element:");
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                a1[i][j]=sc.nextInt();
            }
        } 
        //to enter a2 matrix element
        System.out.println("enter the a2 element"); 
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
               a2[i][j]=sc.nextInt();
            }
        }
        //to sum th a1 and a2 matrix
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                sum[i][j]=a1[i][j]+a2[i][j];
            }
        } 
        //to print the sum matrix
        System.out.println("Sum of a1 and a2 matrix is:");
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }    
    }
}
