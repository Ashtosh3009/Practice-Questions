/**
 * W.A.P. to input number of Litres and print total cost by checking the  rate as follows:
 * No. of Calls      Rate
 * First 1000        Free
 * Next 1000         0.25
 * Next 1000         0.35
 *  >3000            0.50
 *          Also, M.R.=250 (Monthly Rental)
 */
import java.util.*;
public class Litres_of_Water_Part2 {
    public static void main(String args[])
    {
        int c,m=250;
        double r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of calls :");
        c=sc.nextInt();
        if(c<=1000)
        r = m;
        else if(c>1000 && c<=2000)
        r = m + 0.25*(c-1000);
        else if(c>2000 && c<=3000)
        r = m + 0.25*1000 + 0.35*(c-2000);
        else 
        r = m + 0.25*1000 + 0.35*1000 + 0.50*(c-3000);
        System.out.println("Total Cost = "+r);
    }
}
