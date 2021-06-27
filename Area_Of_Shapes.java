/**
 * W.A.P. to print the area and perimeter , according to users choice
 * 1> Circle
 * 2> Square
 * 3> Rectangle
 */
import java.util.*;
public class Area_Of_Shapes {
    public static void main(String args[])
    {
        double ar,p;
        Scanner sc=new Scanner(System.in);
        System.out.println("\tMENU");
        System.out.println("1> Circle");
        System.out.println("2> Square");
        System.out.println("3> Rectangle");
        System.out.println("Enter your choice : ");
        int ch=sc.nextInt();
        if(ch==1)
        {
            System.out.println("Enter Radius : ");
            int r=sc.nextInt();
            ar=355/113*r*r;
            p=2*355/113*r;
        }
        else if(ch==2)
        {
            System.out.println("Enter side of Square : ");
            int s=sc.nextInt();
            ar=s*s;
            p=4*s;
        }
        else if(ch==3)
        {
            System.out.println("Enter length and breadth of Rectangle : ");
            int l,b;
            l=sc.nextInt();
            b=sc.nextInt();
            ar=l*b;
            p=2*(l+b);
        }
        else
        {
            System.out.println("Wrong Choice!!");
            ar=p=0;
        }
        System.out.println("Area : "+ar+"\nPerimeter : "+p);
    }
}