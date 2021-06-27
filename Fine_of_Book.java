/**
 * W.A.P. to input no. of days book returned late and print the fine as follows:
 * No. of Days      Fine/Days
 * 1 - 5              Rs.2
 * 6 - 10             Rs.3
 * 11 - 20            Rs.4
 * >20                Rs.5
 */
import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class Fine_of_Book {
    public static void main(String args[])
    {
        int d;
        double f;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of Days : ");
        d=sc.nextInt();
        if(d<=5)
        f=2*(d);
        else if(d<=10)
        f=2*5+3*(d-5);
        else if(d>=11 && d<=20)
        f=2*5+3*5+4*(d-10);
        else
        {
            f=2*5+3*5+4*10+5*(d-20);
        }
        System.out.println("Total cost = "+f);
    }
}
