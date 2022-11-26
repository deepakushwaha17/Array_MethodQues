/*A nonnegative integer is called a palindrome if it reads forward and backward in the same way. For example, 
 the numbers 5, 121, 3443, and 123454321 are palindromes. 
 Write a method that takes as input a nonnegative integer and returns true if the number is a palindrome; otherwise,
 it returns false. Also write a program to test your method */
import java.util.*;
public class MethodQ5 
{
    public int isPalindrome(int num)
    {
        int a,n=0;
        while(num!=0)
        {
            n=n*10;
            a=num%10;
            n=n+a;
            num/=10; 
        }
        return n;
    }  
    public static void main(String[] args) 
    {
        MethodQ5 obj=new MethodQ5();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num=sc.nextInt();   
        if(obj.isPalindrome(num)==num)
            System.out.println(num+" is a Palindrome Number");
        else
            System.out.println(num+" is not a Palindrome Number");
    } 
}
