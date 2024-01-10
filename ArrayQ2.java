//program to find out whether a given integer is present in an array or not.

import java.util.*;
public class ArrayQ2 
{
    public static void main(String[] args) 
    {
        int arr[]=new int[10];
        int i,count=0,num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array element:");
        for(i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to be searched :");
        num=sc.nextInt();
        for(i=0;i<10;i++)
        {
            if(arr[i]==num)
                count++;
        }
        if(count>0)
            System.out.println("Search Found");
        else
            System.out.println("Search not Found");
    }
}
