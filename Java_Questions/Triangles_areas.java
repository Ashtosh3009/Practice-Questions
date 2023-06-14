/*
Write a program to create Overload method void calc() to calculate the area of equilateral triangle, right-angled triangle and scanlene 
triangle
*/
import java.util.*;
public class Triangles_areas 
{
    double area,semi;
    void calc(int side)
    {
        area = Math.sqrt(3) * side * side / 4.0;
        System.out.println("Area of Equilateral triangle is "+area);
    }    
    void calc(int length , int height)
    {
        area = 0.5 * length * height;
        System.out.println("Area of right-angled triangle is "+area);
    }
    void calc(int a, int b, int c)
    {
        semi = (a+b+c)/2.0;
        area = Math.sqrt(semi * (semi-a) * (semi-b) * (semi-c));
        System.out.println("Area of Scalene Triangle is "+area);
    }
    public static void main (String args[])
    {
        int side, length, height, a,b,c;
        Scanner sc = new Scanner (System.in);
        Triangles_areas ob = new Triangles_areas();
        System.out.print("\nEnter length of side of Equilateral Triangle : ");
        side = sc.nextInt();
        ob.calc(side);
        System.out.print("\nEnter length and height of Right-angled triangle : ");
        length = sc.nextInt();
        height = sc.nextInt();
        ob.calc(length , height);
        System.out.print("\nEnter three sides of Scalene Triangle : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        ob.calc(a, b, c);
        sc.close();
    }
}
