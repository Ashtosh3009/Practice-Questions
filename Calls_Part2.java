/**
 * W.A.P. to input number of calls and print total cost by checking the  rate as follows:
 * No. of Calls      Rate
 * First 100         1.5
 * Next 200          1.25
 * Next 300          0.80
 *  >600             0.40
 */
import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class Calls_Part2
{
    public static void main(String args[])
    {
        int c;
        double r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of calls : ");
        c=sc.nextInt();
        if(c<=100)
        r = 1.5*c;
        else if(c<=300)
        r = 1.5*100 + 1.25*(c-100);
        else if(c<=600)
        r = 1.5*100 + 1.25*200 + 0.80*(c-300);
        else 
        {
            r= 1.5*100 + 1.25*200 + 0.80*300 + 0.40*(c-600);
        }
        System.out.println("Total Cost : "+r);
    }
}