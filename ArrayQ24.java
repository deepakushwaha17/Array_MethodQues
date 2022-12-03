//Remove Duplicate Element in an Array
import java.util.*;
public class ArrayQ24 
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
        //loop to remove duplicate element
        System.out.println("Array element after removing duplicate elements are:");
        for(int i=0;i<n;i++) 
        {     
            for(int j=i+1;j<arr.length;j++) 
            {     
               if(arr[i]==arr[j]) 
               {    
                    count++;  
               }     
            }
            if(count==0)
            {
                System.out.print(arr[i]+" ");
            }
            count=0;
        }    
    }          
}
