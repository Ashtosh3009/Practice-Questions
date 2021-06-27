//W.A.P. to input 3 numbers and print the largest of them.
import java.util.*;
public class Largest_Number {
    public static void main(String args[])
    {
        int a,b,c,max;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 numbers : ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b && a>c)
        max=a;
        else if(b>a && b>c)
        max=b;
        else
        max=c;
        System.out.println("Largest Number = "+max);
    }
}
