/**
 * W.A.P. to imput temperature in degree in Celsius and print temperature as per following mean:
 * 1> Kelvin
 * 2> Fahrenheit
 */
import java.util.*;
public class Temperature {
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int ch;
        double c,r;
        System.out.println("\tMENU");
        System.out.println("1> Kelvin");
        System.out.println("2> Fahrenheit");
        System.out.print("Enter a choice : ");
        ch=sc.nextInt();
        System.out.print("Enter degree in Celsius : ");
        c=sc.nextDouble();
        switch(ch)
        {
            case 1: r = 273.15+c;
            break;
            case 2: r=9.0/5*c+32.0;
            break;
            default : System.out.println("Wrong choice !!!");
            r=0; 
        }
        System.out.println("Resultant temperature : "+r);
        sc.close();
    }
}
