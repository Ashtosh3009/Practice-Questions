// W.A.P. to input two numbers and print the sum of the following series :
// S = 1 - x + x^2/8 - x^3/27 ...... x^n/n^3
import java.util.*;
public class Series_Sum_19 {
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int x,n,i,sgn=-1;
        double s=1.000;
        System.out.print("Enter two numbers : ");
        x = sc.nextInt();
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            s = s + Math.pow(x,i) / Math.pow(i,3) * sgn;
            sgn*=-1;
        }
        System.out.println("Sum = "+s);
        sc.close();
    }
}
