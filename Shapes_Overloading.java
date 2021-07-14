// Write a program to overload a function void volume() to calculate the volume of cube , sphere and cuboid.
// Voulme of cube = a^3
// Volume of sphere = (4 * pi * r^3) / 3
// Volume of cuboid = l x b x h
import java.util.Scanner;
public class Shapes_Overloading 
{
    double area, pi = 355/113.0;
    void volume (int side)
    {
        area = Math.pow(side,3);
        System.out.println("Area of Cube = "+area);
    }   
    void volume (double radius)
    {
        area = 4.0 * pi * Math.pow(radius,3) / 3.0;
        System.out.println("Area of Sphere = "+area);
    }
    void volume (int l, int b, int h)
    {
        area = l * b * h;
        System.out.println("Area of Cuboid = "+area);
    }
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        Shapes_Overloading ob = new Shapes_Overloading();
        int a, b, c;
        double r;
        System.out.print("\nEnter length of side of Cube = ");
        a = sc.nextInt();
        ob.volume(a);
        System.out.print("\nEnter radius of sphere = ");
        r = sc.nextDouble();
        ob.volume(r);
        System.out.print("\nEnter length, breadth and height of cuboid = ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        ob.volume(a,b,c);
        sc.close();
    }
}
