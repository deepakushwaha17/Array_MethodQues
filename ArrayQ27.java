//Print Odd and Even Number from an Array
import java.util.*;
public class ArrayQ27 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array length:");
        int n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array element:");
        //loop to intialize array element
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        //loop print odd elements of array
        System.out.println("Odd Numbers:");  
        for(int i=0;i<n;i++)
        {  
            if(arr[i]%2!=0) 
                System.out.print(arr[i]+" ");    
        } 
        //loop print even elements of array
        System.out.println("\nEven Numbers:");  
        for(int i=0;i<n;i++)
        {  
            if(arr[i]%2==0)
                System.out.print(arr[i]+" ");    
        }  
    }
}
