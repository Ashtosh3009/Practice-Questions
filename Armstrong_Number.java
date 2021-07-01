// W.A.P. tto input a number and check whether it is Armstrong number or not.
// Example : 1^3+5^3+3^3 = 1+125+27 = 153
import java.util.*;
public class Armstrong_Number {
    public static void main (String args[])
    {
        int n,res=0,d,t;
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        t = n;
        while(t>0)
        {
            d=t%10;
            res = res + d*d*d;
            t/=10;
        }
        if(res == n)
        System.out.println("It is an Armstrong Number");
        else
        System.out.println("It is not a Armstrong Number");
        sc.close();
    }
}
