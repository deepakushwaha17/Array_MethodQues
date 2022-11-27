//Java Program to find the frequency of each element in the array
import java.util.*;
public class ArrayQ9 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array length:");
        int n=sc.nextInt();
        int arr[] = new int[n];
        int count=0;
        System.out.println("Enter the array element:");
        //loop to intialize array element
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        //loop to find frequency of array elements    
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=n-1;j++)
            {
                if(arr[i]==arr[j])
                    count++;
            }
            System.out.printf("Frequncy of %d is : %d\n",arr[i],count);
            count=0;
        }
    }   
}
