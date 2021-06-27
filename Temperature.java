/**
 * W.A.P. to input temperature in Celsius degree and print the equivalent temperature according to 
 * users choice.
 * 1> Kelvin
 * 2> Fahrenheit
 */
import java.util.*;
public class Temperature {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ch;
        double c,res;
        System.out.println("\t\tMENU");
        System.out.println("\t1> Kelvin");
        System.out.println("\t2> Fahremheit");
        System.out.print("\tEnter your choice : ");
        ch=sc.nextInt();
        System.out.println("Enter degree in Celsius : ");
        c=sc.nextDouble();
        if(ch==1)
        res=273.15+c;
        else if(ch==2)
        res=9.0/5*c+32;
        else
        {
            res=c;
            System.out.println("Wrong Choice!!!");
        }
        System.out.println("Result = "+res);
    }
}
