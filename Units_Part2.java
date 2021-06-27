/**
 * W.A.P. to input number of units and print total cost by checking the  rate as follows:
 * No. of Calls      Rate
 * First 75          4
 * Next 100          6
 * Next 125          8
 *  >300             10
 */
import java.util.*;
public class Units_Part2 {
    public static void main(String argsp[])
    {
        Scanner sc=new Scanner(System.in);
        int c;
        double r;
        System.out.print("Enter Number of calls : ");
        c=sc.nextInt();
        if(c<=75)
        r = c*4;
        else if(c>75 && c<=175)
        r = 75*4 + (c-75)*6;
        else if(c>175 && c<=300)
        r = 75*4 + 100*6 + (c-175)*8;
        else 
        r = 75*4 + 100*6 + 125*8 + (c-300)*10;
        System.out.println("Total Cost = "+r);
    }
}
