/**
 * W.A.P. to input type and price of computer purchased and print the discount and net price to be paid.
 *                  D       L
 * upto 30,000      5%      3%
 * upto 50,000      10%     7%
 *   >50,000        20%     15%
 */
import java.util.*;
public class Computer_Purchased {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int p;
        char t;
        double r;
        System.out.print("Enter type : ");
        t=sc.next().charAt(0);
        System.out.print("Enter price : ");
        p=sc.nextInt();
        if(t=='D'||t=='d')
        {
            if(p<=30000)
            r=p*0.05;
            else if(p<=50000)
            r=p*0.10;
            else 
            r=p*0.20;
        }
        else if(t=='L'||t=='l')
        {
            if(p<=30000)
            r=p*0.03;
            else if(p<=50000)
            r=p*0.07;
            else 
            r=p*0.15;
        }
        else
        {
            System.out.println("Wrong Choice !!!");
            r=-1;
        }
        System.out.println("Discount : "+r);
        System.out.println("Net Price : "+(p-r));
    }
}