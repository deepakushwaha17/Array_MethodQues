/*A prime number is a number that is evenly divisible only by itself and 1. For example, the number 5 is prime
 because it can be evenly divided only by 1 and 5. The number 6, however, is not prime because it can be divided 
 evenly by 1, 2, 4, and 6.
 Write a method named isPrime, which takes an integer as an argument and returns true if the argument is a 
 prime number, or false otherwise. Also write main method that displays prime numbers between 1 to 500.     */
import java.util.*;
public class MethodQ4 
{
    public boolean isPrime(int n)
    {
        boolean flag=true;
        int i=2;
        if (n<=1) 
          flag=false;
        while(i<=n/2) 
        {  
          if (n%i==0)
            flag=false;
          i++;
        }
        return flag;  
    } 
    public static void main(String[] args) 
    {
        MethodQ4 obj=new MethodQ4();
        System.out.println("Prime numbers between 1 and 500 is:"); 
        for (int i=1;i<=500;i++) {  
           if (obj.isPrime(i)==true) 
               System.out.println(i);  
       }  
    }

}

