/**
 * W.A.P. to input type and price and print the discount and net price to be paid.
 *                     F           T
 * upto Rs.1000        10%         8%
 * upto Rs.2000        20%         15%
 *   >Rs.2000          20%+300     15%+Rs.500
 */ 
import java.util.*;
public class FT {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter type (F/T) : ");
        char ch=sc.next().charAt(0);
        System.out.print("Enter Price : ");
        int p=sc.nextInt();
        double d,net;
        if(ch=='F' || ch=='f')
        {
            if(p<=1000)
            d=0.10*p;
            else if(p<=2000)
            d=0.20*p;
            else 
            d=0.20*p + 300;
        }
        else if(ch=='T' || ch=='t')
        {
            if(p<=1000)
            d=8.0/100*p;
            else if(p<=2000)
            d=15.0/100*p;
            else 
            d=15.0/100 * p + 500;
        }
        else 
        {
            d=0;
            System.out.println("Wrong Choice !!!");
        }
        net=p-d;
        System.out.println("Discount = "+d+"\nNet Price = "+net);
    }
}