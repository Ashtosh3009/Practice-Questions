// S = x + (2x)/2! + (3x)/3! + ...... + (nx)/n!
import java.util.*;
public class NestedSeries3 {
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n,x,i,j,f;
        double sum = 0.0;
        System.out.print("Enter two number : ");
        x = sc.nextInt();
        n = sc.nextInt();
        for (i=1;i<=n;i++)
        {
            f = 1;
            for(j=1;j<=i;j++)
            {
                f = f * j;
            }
            sum = sum + (double)(i*x)/f;
        }
        System.out.println("Sum = "+sum);
        sc.close();
    }
}
