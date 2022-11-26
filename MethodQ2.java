/*Write a method named isEven that accepts an int argument. The method should return true if the argument is even, 
or false otherwise. Also write a program to test your method. */
import java.util.*;
public class MethodQ2 
{
    public boolean isEven(int n)
    {
        boolean flag=false;
        if(n%2==0)
            flag=true;
        else
            flag=false;
        return flag;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer number:");
        int num=sc.nextInt();
        MethodQ2 obj=new MethodQ2();
        if(obj.isEven(num)==true)
            System.out.println(num+" is an Even Number");
        else
            System.out.println(num+" is an Odd Number");
    }
}
