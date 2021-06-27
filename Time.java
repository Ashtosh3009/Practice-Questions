/**
 * W.A.P. to input number of Hours and print total cost by checking the rate as follows:
 * No. of hours      Rate
 * First 100         Free
 * Next 50           50
 * Next 30           80
 *  >180             100
 *          Also, M.R.=2500 (Monthly Rental)
 */
import java.util.*;
public class Time {
    public static void main(String args[])
    {
        int m=2500,h,r;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of hours : ");
        h=sc.nextInt();
        if(h<=100)
        r=m;
        else if(h<=150)
        r=m+50*(h-100);
        else if(h<=180)
        r=m+50*50+80*(h-150);
        else
        r=m+50*50+80*30+100*(h-180);
        System.out.println("Total Cost = "+r);
    }
}
