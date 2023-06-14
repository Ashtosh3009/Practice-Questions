/**
 * W.A.P. to input number of Litres and print total cost by checking the  rate as follows:
 * No. of Calls      Rate
 * First 50          Free
 * Next 50           0.10
 * Next 100          0.20
 *  >200             0.25
 *          Also, M.R.=15 (Monthly Rental)
 */
import java.util.*;
public class Words {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m=15,c;
        double r;
        System.out.print("Enter call = ");
        c=sc.nextInt();
        if(c>=1 && c<=50)
        r = m + 0;
        else if(c>=51 && c<=100)
        r = m + 0.10*(c-50);
        else if(c>=101 && c<=200)
        r = m + 0.10*50 + 0.20*(c-100);
        else 
        r = m + 0.10*50 + 0.20*100 + 0.25*(c-200);
        System.out.println("Total Cost = "+r);
    }
}
