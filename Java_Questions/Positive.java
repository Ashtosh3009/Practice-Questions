//W.A.P. to input a number and check whether it is positive, negative or zero.
import java.util.*;
public class Positive {
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        n=sc.nextInt();
        if(n>0)
        System.out.println("Positive");
        else if(n<0)
        System.out.println("Negative");
        else
        System.out.println("Zero");
    }
}
