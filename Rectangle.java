/**
 * W.A.P. to input length and breadth of a rectangle and result according to users
 * choice:-
 * 1> Area
 * 2> Perimeter
 * 3> Diagonal
 */
import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class Rectangle {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l,b,c;
        double res;
        System.out.println("\t\tMENU");
        System.out.println("\t1> Area");
        System.out.println("\t2> Perimeter");
        System.out.println("\t3> Diagonal");
        System.out.println("\tEnter your choice : ");
        c=sc.nextInt();
        System.out.println("\tEnter variables :");
        l=sc.nextInt();
        b=sc.nextInt();
        if(c==1)
        System.out.println("Area : "+(l*b));
        else if(c==2)
        System.out.println("Perimeter = "+(2*(l+b)));
        else if(c==3)
        System.out.println("Diagonal = "+(Math.sqrt(l*l+b*b)));
        else
        System.out.println("Wrong Choice!!!");
    }

    private static void extracted() {
        System.out.print("\tEnter length and breadth of a rectangle : ");
    }
}
