//Java Program to print the sum of all the items of the array
import java.util.*;
public class ArrayQ17 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array length:");
        int n=sc.nextInt();
        int arr[] = new int[n];
        int sum=0;
        System.out.println("Enter the array element:");
        //loop to intialize array element
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        //loop to sum all the element of array
        System.out.println("Sum of Array elements are: ");
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        System.out.print(sum);
    }   
}

