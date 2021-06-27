/**
 * W.A.P. to input distance in Kilometres and print total cost by checking the rate per kilometre as follows:
 * Distance in KM     Rate/Km
 * First              10
 * Next 5             8
 * Next 10            6
 *   >16              3
 */
import java.util.*;
public class Distance_In_Kilometres {
    public static void main(String args[])
    {
        int km,r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter distance in Kilometer : ");
        km=sc.nextInt();
        if(km==1)
        r=10;
        else if(km>1 && km<=6)
        r=10 + 8*(km-1);
        else if(km>6 && km<=16)
        r=10 + 8*5 + 6*(km-6);
        else
        r=10 + 8*5 + 6*10 + 3*(km-16);
        System.out.println("Total cost = "+r);
    }
}
