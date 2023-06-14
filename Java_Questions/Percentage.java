// Write a program to find percentage of three marks using return.
import java.util.*;
public class Percentage {
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter marks in three subjects : ");
        int marks1, marks2, marks3;
        double percentage;
        marks1 = sc.nextInt();
        marks2 = sc.nextInt();
        marks3 = sc.nextInt();
        Percentage ob = new Percentage ();
        percentage = ob.calculate(marks1 , marks2 , marks3);
        System.out.println("Percentage = "+percentage);
        sc.close();
    }
    double calculate(int a, int b, int c)
    {
        double per = (a+b+c)/3.0;
        return per;
    }
}
