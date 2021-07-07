// S = x/2! + (2x)/3! + (3x)/4! + ...... + (nx)/(n+1)!
import java.util.*;
public class NestedSeries4 {
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int x,n,i,j,f;
        double sum=0.0;
        System.out.print("Enter two numbers : ");
        x = sc.nextInt();
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            f=1;
            for(j=1;j<=(i+1);j++)
            {
                f = f * j;
            }
            sum = sum + (double)(i*x)/f;
        }
        System.out.println("Sum = "+sum);
        sc.close();
    }
}
