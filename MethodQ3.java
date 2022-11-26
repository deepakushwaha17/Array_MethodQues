/*Write a value-returning method, isVowel that returns the value true if a given character is a vowel,and otherwise 
returns false. In main() method accept a string from user and count number of vowels in that string.*/
import java.util.*;
public class MethodQ3
{
    public boolean isVowel(char ch)
    {
        boolean flag=false;
        if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            flag=true;
        else
            flag=false;
        return flag;
    }
    public static void main(String[] args) 
    {
        MethodQ3 obj=new MethodQ3();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        str=str.toUpperCase();
        char ch;int count=0;
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(obj.isVowel(ch)==true)
             count++;
        }
        System.out.println("Total no.of vowels in the string :"+ str+" is :"+count);
    }
}