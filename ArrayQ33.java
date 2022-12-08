//Java Program to find the frequency of odd & even numbers in the given array.
import java.util.*;
public class ArrayQ33 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array length:");
        int n=sc.nextInt();
        int arr[] = new int[n];
        int odd=0,even=0;
        System.out.println("Enter the array element:");
        //loop to intialize array element
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        //loop print odd elements of frequency
        for(int i=0;i<n;i++)
        {  
            if(arr[i]%2!=0) 
                odd++;
        }
        System.out.println("Total Odd Numbers are:"+odd);  
        //loop print even elements of frequency
        for(int i=0;i<n;i++)
        {  
            if(arr[i]%2==0)
                even++;
        } 
        System.out.println("Total Even Numbers are:"+even);  
    }
}
