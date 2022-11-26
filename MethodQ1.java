/*Write a program with a method named getTotal that accepts two integers as an argument and return its sum. 
Call this method from main( ) and print the results. */
import java.util.*;
public class MethodQ1 
{
    public int getTotal(int a,int b)
    {
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two integer value:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        MethodQ1 obj=new MethodQ1();
        int sum=obj.getTotal(n1, n2);
        System.out.printf("Sum to two number %d and %d is : %d",n1,n2,sum);       
    }
}
