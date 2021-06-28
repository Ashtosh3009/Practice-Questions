/**
 * W.A.P. to input length and breadth of a rectangle and result according to users choice:-
 * 1> Area
 * 2> Perimeter
 * 3> Diagonal
 */
import java.util.*;
public class Rectangle_Switch
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length and breadth of Rectangle : ");
        int l=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("\tMENU");
        System.out.println("1> Area");
        System.out.println("2> Perimeter");
        System.out.println("3> Diagonal");
        System.out.print("Enter your choice : ");
        int ch=sc.nextInt();
        double d;
        switch(ch)
        {
            case 1: d=l*b;
            break;
            case 2: d=2*(l+b);
            break;
            case 3: d=Math.sqrt(l*l+b*b);
            break;
            default : d=0;
            System.out.println("Wrong Choice!!!");
        }
        System.out.println("Result = "+d);
    }
}