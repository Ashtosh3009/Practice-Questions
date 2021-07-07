// S = 1 - x + (x^2)/3! - (x^3)/5! ...... (x^n)/(2n-1)!
import java.util.*;
public class NestedSeries10 {
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int x,n,i,j,f, sgn=-1;
        double sum=1.0;
        System.out.print("Enter X and N : ");
        x = sc.nextInt();
        n = sc.nextInt();
        for(i=1 ; i<=n ; i++)
        {
            f = 1;
            for(j=1 ; j<=(2*i-1) ; j++)
            {
                f*=j;
            }
            sum += Math.pow(x,i)/f * sgn;
            sgn *= -1;
        }
        System.out.println("Sum = " + sum);
        sc.close();
    }
}
