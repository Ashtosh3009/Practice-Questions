/**
 * W.A.P. to input two numbers and print your choice :
 * 1> Addition
 * 2> Subtraction
 * 3> Product
 * 4> Division
 * 5> Modulus
 */
import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class Calculate {
    public static vid main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int ch,a,b;
        double res;
        System.out.println("\t\tMENU");
        System.out.println("\t1> Addition");
        System.out.println("\t2> Subtraction");
        System.out.println("\t3> Product");
        System.out.println("\t4> Divison");
        System.out.println("\t5> Modulus");
        System.out.print("\tEnter your choice : ");
        ch=sc.nextInt();
        System.out.println("\tEnter two numbers : ");
        a=sc.nextInt();
        b=sc.nextInt();
        if(ch==1)
        res=a+b;
        else if(ch==2)
        res=Math.abs(a-b);
        else if(ch==3)
        res=a*b;
        else if(ch==4)
        res=a/b;
        else if(ch==5)
        res=a%b;
        else 
        res=0;
        System.out.println("\tResult = "+res);
    }
}