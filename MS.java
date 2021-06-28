/**
 * W.A.P. to input type and price and print the discount and net price to be paid.
 *                  M       S
 * upto 5,000       2.5%    2%
 * upto 20,000      5%      4%
 *   >20,000        8%      8%+Rs.500
 */
import java.util.*;
public class MS {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter type (M/S) and price : ");
        char t=sc.next().charAt(0);
        int p=sc.nextInt();
        double d,net;
        if(t=='M' || t=='m')
        {
            if(p<=5000)
            d=2.5/100*p;
            else if(p<=20000)
            d=5.0/100*p;
            else 
            d=8.0/100*p;
        }
        else if(t=='S' || t=='s')
        {
            if(p<=5000)
            d=2.0/100*p;
            else if(p<=20000)
            d=4.0/100*p;
            else 
            d=8.0/100*p + 500;
        }
        else 
        {
            System.out.println("Wrong Choice !!!");
            d=0;
        }
        net=p-d;
        System.out.println("Discount = "+d+"\nNet Price = "+net);
    }
}
