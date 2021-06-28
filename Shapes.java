/**
 * W.A.P. to print the area and perimeter according to user's choice .
 * C> Circle
 * R> Rectangle
 * S> Square
 */
import java.util.*;
public class Shapes {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\tMENU");
        System.out.println("C> Circle");
        System.out.println("R> Rectangle");
        System.out.println("S> Square");
        System.out.print("Enter your choice : ");
        char ch = sc.next().charAt(0);
        double p,ar;
        switch(ch)
        {
            case 'c':
            case 'C': System.out.print("Enter radius of circle : ");
            int r = sc.nextInt();
            ar = 355.0/113*r*r;
            p = 2.0 * 355/113.0 * r;
            break;
            case 'R':
            case 'r': System.out.println("Enter length and breadth of Recttangle : ");
            int l = sc.nextInt();
            int b = sc.nextInt();
            ar = l*b;
            p = 2*(l+b);
            break;
            case 's':
            case 'S': System.out.println("Enter side of Square : ");
            int s = sc.nextInt();
            ar = s*s;
            p = 4 * s;
            break;
            default:
            System.out.println("Invalid Input !!!");
            ar = p = 0;
            break;
        }
        System.out.println("Area = "+ar+"\nPerimeter : "+p);
        sc.close();
    }
}
