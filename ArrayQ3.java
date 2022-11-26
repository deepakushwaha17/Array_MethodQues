//Calculate the average marks from an array containing marks of all students in physics using a for-each loop.
import java.util.*;
class ArrayQ3
{
    public static void main(String[] args) 
    {
        int phy_marks[]=new int[10];
        float total=0.0f,avg;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the physics marks of all students:");
        for(int i:phy_marks)
        {
            phy_marks[i]=sc.nextInt();
        }
        for(int i:phy_marks)
        {
            total+=phy_marks[i];
        }
        avg=total/20;
        System.out.println("Average Marks is:"+avg);
    }
}

