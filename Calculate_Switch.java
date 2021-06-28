/**
 * W.A.P. to input two numbers and print your choice :
 * 1> Addition
 * 2> Subtraction
 * 3> Product
 * 4> Division
 * 5> Modulus
 */
import java.util.*;
public class Calculate_Switch {
    public static void main(String []args)
    {
        int ch,a,b;
        double res;
        Scanner sc=new Scanner(System.in);
        System.out.println("\tMENU");
        System.out.println("1> Addition");
        System.out.println("2> Subtraction");
        System.out.println("3> Product");
        System.out.println("4> Division");
        System.out.println("5> Modulus");
        System.out.println("Enter your choice : ");
        ch=sc.nextInt();
        System.out.println("Enter two numbers ; ");
        a=sc.nextInt();
        b=sc.nextInt();
        switch(ch)
        {
            case 1: res=a+b;
            break;
            case 2: res=Math.abs(a-b);
            break;
            case 3: res=a*b;
            break;
            case 4: res=a/b;
            break;
            case 5: res=a%b;
            break;
            default : System.out.println("Wrong Choice!!!");
            res=0;
        }
        System.out.println("Result = "+res);
    }
}
