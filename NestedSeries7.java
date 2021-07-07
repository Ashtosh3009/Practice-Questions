// S = x/2! - (2x)/(3!) + (3x)/(4!) ...... (nx)/((n+1)!)
import java.util.*;
public class NestedSeries7 {
    public static void main (String args[])
    {
        int n,x,i,j,f,sign=1;
        double sum = 0.0;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter X and N : ");
        x = sc.nextInt();
        n = sc.nextInt();
        for(i=1 ; i<=n ; i++)
        {
            f = 1;
            for(j=1 ; j<=(i+1) ; j++)
            {
                f = f * j;
            }
            sum = sum + (double)(i*x)/f * sign;
            sign = sign * (-1);
        }
        System.out.println("Sum = "+sum);
        sc.close();
    }
}
