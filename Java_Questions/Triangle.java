/**
 * W.A.P. to print area of triangle:
 * 1> Equilateral Triangle
 * 2> Right- angle triangle
 * 3> Scalene triangle
 */
import java.util.*;
public class Triangle {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ch;
        double ar;
        System.out.println("\tMENU");
        System.out.println("1> Equilateral Triangle");
        System.out.println("2> Right-Angled Triangle");
        System.out.println("3> Scalene Triangle");
        System.out.print("Enter your choice : ");
        ch=sc.nextInt();
        if(ch==1)
        {
            int a;
            System.out.println("Enter side of triangle : ");
            a=sc.nextInt();
            ar=Math.sqrt(3)*a*a/4.0;
        }
        else if(ch==2)
        {
            int l,b;
            System.out.println("Enter sides of triangle : ");
            l=sc.nextInt();
            b=sc.nextInt();
            ar=0.5*l*b;
        }
        else if(ch==3)
        {
            int a,b,c;
            System.out.println("Enter sides of triangle : ");
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            double s;
            s=(a+b+c)/2.0;
            ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        }
        else
        {
            ar=0;
            System.out.println("Wrong Choice!!!");
        }
        System.out.println("Area of Triangle : "+ar);

    }
}