/**
 * W.A.P. to input type and price and print the discount and net price to be paid.
 *                  H       S
 * upto 40,000      5%      10%
 * upto 1 Lac       8%      20%
 *   >1 Lac         12%     25%
 */
import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class HS {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter type (H/S) : ");
        char ch=sc.next().charAt(0);
        System.out.print("Enter Price : ");
        int p=sc.nextInt();
        double d,net;
        if(ch=='H' || ch=='h')
        {
            if(p<=40000)
            d=0.05*p;
            else if(p<=100000)
            d=0.08*p;
            else 
            d=0.12*p;
        }
        else if(ch=='S' || ch=='s')
        {
            if(p<=40000)
            d=0.10*p;
            else if(p<=100000)
            d=0.20*p;
            else 
            d=0.25*p;
        }
        else 
        {
            d=0;
        }
        net=p-d;
        System.out.println("Discount = "+d+"\nNet Price = "+net);
    }
}