// W.A.P. to input two numbers and print the sum of the following series :
// S = x - x^2/3 + x^3/5 ...... x^n/(2n-1)
import java.util.*;
public class Series_Sum_13 {
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int x,n,i,sign=1;
        double s=0.0;
        System.out.print("Enter two numbers : ");
        x = sc.nextInt();
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            s=s+Math.pow(x,i)/(2*i-1) * sign;
            sign = sign*-1;
        }
        System.out.println("Sum = "+s);
    }
}
