/**
Write a program to perform following functions and also call them all, using main() method.
double area (double a, double b, double c) :- returns area of scalene triangle
double area (int a, int b, int height) :- returns area of trapezium
double area (double d1, double d2) :- returns area of Rhombus
 */
import java.util.*;
public class Areas_of_Pointed_Shapes 
{
    double semi, ar;
    double area (double a, double b, double c)
    {
        semi = (a+b+c)/2.0;
        ar = Math.sqrt(semi * (semi-a) * (semi-b) * (semi-c));
        return ar;
    }    
    double area (int a, int b, int height)
    {
        ar = 0.5 * (a+b) * height;
        return ar;
    }
    double area (double d1, double d2)
    {
        ar = 0.5 * d1 * d2;
        return ar;
    }
    public static void main (String args[])
    {
        int A,B,height;
        double a,b,c,d1,d2;
        double ar_scale, ar_trap, ar_rhom;
        Scanner sc = new Scanner (System.in);
        Areas_of_Pointed_Shapes ob = new Areas_of_Pointed_Shapes();
        System.out.print("\nEnter sides of Scalene Triangle : ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        ar_scale = ob.area(a,b,c);  
        System.out.println("Area of Scalene Triangle = "+ar_scale);      
        System.out.print("\nEnter parallel sides and distance between them of the Trapezium : ");
        A = sc.nextInt();
        B = sc.nextInt();
        height = sc.nextInt();
        ar_trap = ob.area(A, B, height);
        System.out.println("Area of Trapezium = "+ar_trap);
        System.out.print("\nEnter diagonals' length of Rhombus : ");
        d1 = sc.nextDouble();
        d2 = sc.nextDouble();
        ar_rhom = ob.area(d1, d2);
        System.out.println("Area of Rhombus = "+ar_rhom);
        sc.close();
    }
}
