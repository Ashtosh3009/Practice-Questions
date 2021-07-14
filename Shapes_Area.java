// Write a program to overload a function void area() to print area of circle, rectangle and square.
import java.util.*;
public class Shapes_Area 
{
    double area, pi=355/113.0;
    void area(double radius)
    {
        area = pi * radius * radius ;
        System.out.println("Area of Circle = "+area);
    }
    void area (int length, int breadth)
    {
        area = length * breadth;
        System.out.println("Area of Rectangle = "+area);
    }
    void area(int side)
    {
        area = side * side;
        System.out.println("Area of square = "+area);
    }
    public static void main (String args[])
    {
        int length, breadth, side;
        double radius;
        Scanner sc = new Scanner (System.in);
        Shapes_Area ob = new Shapes_Area();
        System.out.print("\nEnter radius of the Circle : ");
        radius = sc.nextDouble();
        ob.area(radius);
        System.out.print("\nEnter Length and Breadth of the Rectangle : ");
        length = sc.nextInt();
        breadth = sc.nextInt();
        ob.area( length , breadth );
        System.out.print("\nEnter length of a side of Square : ");
        side = sc.nextInt();
        ob.area(side);
        sc.close();
    }
}