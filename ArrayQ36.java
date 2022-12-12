//Java Program to display the upper triangular matrix
import java.util.*;
public class ArrayQ36 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row and column:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][] = new int[m][n];
        if(m!=n)
        {    
            System.out.println("Matrix should be a square matrix");    
        }    
        else 
        {           
            //loop to intialize matrix element
            System.out.println("Enter the matrix:");
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    arr[i][j]=sc.nextInt();
                }
            }
 
            //loop to convert given matrix into upper triangular matrix    
            System.out.println("Upper triangular matrix: ");    
            for(int i=0;i<m;i++)
            {    
                for(int j=0;j<n;j++)
                {    
                  if(j<i) 
                      System.out.print("0 ");    
                  else    
                    System.out.print(arr[i][j] + " ");    
                }    
                System.out.println();    
            }    
        }
    }
}
