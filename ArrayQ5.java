//Java program to reverse an array.
import java.util.*;
public class ArrayQ5 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array length:");
        int n=sc.nextInt();
        int arr[] = new int[n];
        int revarr[]=new int[n];
        int j=n;
        System.out.println("enter the array element:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        //reversing the array
        for (int i = 0; i < n; i++) {
            revarr[j-1] = arr[i];
            j=j-1;
        }
  
        // printing the reversed array
        System.out.println("Reversed array is:");
        for (int i= 0; i<n; i++) {
            System.out.print(revarr[i]+" ");
        }
    }   
}
