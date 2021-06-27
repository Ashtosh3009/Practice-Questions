/**
 * W.A.P. to input two numbers and print the absolute difference between them.
 */
import java.util.Scanner;
public class Absolute_Difference {
    public static void main(String args[])
    {
        int a,b,s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b)
        s=a-b;
        else
        s=b-a;
        System.out.println("Absolute Difference = "+s);
    }
}
