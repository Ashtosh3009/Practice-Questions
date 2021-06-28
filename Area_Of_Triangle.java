/**
 * W.A.P. to print area of triangle : 
 * 1. Equilateral triangle
 * 2. Right angle triangle
 * 3. Scalene triangle
 */
import java.util.*;
public class Area_Of_Triangle {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\tMENU");
        System.out.println("1. Equilateral Triangle");
        System.out.println("2. Right-angle Triangle");
        System.out.println("3. Scalene Triangle");
        System.out.println("Enter your choice : ");
        int ch = sc.nextInt();
        int a,b,c;
        double s,ar;
        switch(ch)
        {
            case 1 : System.out.print("Enter side of Equilateral triangle : ");
            a=sc.nextInt();
            ar=Math.sqrt(3)*a*a/4.0;
            break;
            case 2 : System.out.print("Enter two sides of Right-angle triangle : ");
            a=sc.nextInt();
            b=sc.nextInt();
            ar=0.5*a*b;
            break;
            case 3 : System.out.print("Enter three sides of Scalene Triangle : ");
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            s = (a + b + c) / 2.0;
            ar = Math.sqrt(s * (s - a) * (s-b) * (s-c));
            break;
            default : ar=0.0;
            break;
        }
        System.out.println("Area = "+ar);
        sc.close();
    }
}
