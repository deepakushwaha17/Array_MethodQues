//Create an array of 5 floats and calculate their sum.
import java.util.*;
class ArrayQ1
{
    public static void main(String[] args) 
    {
        float num[]=new float[5];
        float sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 5 float value:");
        for(int i=0;i<5;i++)
        {
            num[i]=sc.nextFloat();
        }
        for(int i=0;i<5;i++)
        {
            sum+=num[i];
        }
        System.out.println("Sum of 5 float number is:"+sum);

    }
}
