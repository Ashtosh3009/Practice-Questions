/**W.A.P. to input aPrinciple and time and print the simple interest.
 *              3       5       7
 * upto 1 Lac   6%      7%      8%
 * upto 5 Lac   8%      9%      10%
 *  >5 Lac      8.5%    9.5%    10.5%
 */
import java.util.*;
public class Simple_Interest {
    public static void main(String []args)
    {
        int t,p;
        double r,si;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Principal : ");
        p=sc.nextInt();
        System.out.print("Enter Time (in years) : ");
        t=sc.nextInt();
        if(t==3)
        {
            if(p<=100000)
            r=0.06;
            else if(p<500000)
            r=0.08;
            else 
            r=8.5/100;
        }
        else if(t==5)
        {
            if(p<=100000)
            r=0.07;
            else if(p<500000)
            r=0.09;
            else 
            r=9.5/100;
        }
        else if(t==7)
        {
            if(p<=100000)
            r=0.08;
            else if(p<500000)
            r=0.10;
            else 
            r=10.5/100;
        }
        else 
        {
            r=0;
            System.out.println("Wrong Input!!!");
        }
        si=(p*r*t)/100.0;
        System.out.println("Rate : "+r+"\nSimple Interest : "+si);
    }
}
