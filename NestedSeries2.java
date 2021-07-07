// S = x + (x^2)/2! + (x^3)/3! + ...... + (x^n)/n!
import java.util.*;
public class NestedSeries2 {
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter two number : ");
        int x,n,i,j,f;
        double sum=0;
        x = sc.nextInt();
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            f = 1;
            for(j=1;j<=i;j++)
            {
                f = f * j;
            }
            sum = sum + Math.pow(x,i)/f;
        }
        System.out.println("Sum = "+sum);
        sc.close();
    }
}
