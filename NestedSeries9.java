// S = 1 + x + (x^2)/4! + (x^3)/9! ........ (x^n)/(n^2)!
import java.util.*;
public class NestedSeries9 {
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int x,n,i,j,f=1;
        double sum = 1.0;
        System.out.print("Enter X and N : ");
        x = sc.nextInt();
        n = sc.nextInt();
        for(i=1 ; i<=n ; i++)
        {
            f = 1;
            for(j=1 ; j<=(i*i) ; j++)
            {
                f = f * j;
            }
            sum += Math.pow(x,i)/f;
        }
        System.out.println("Sum = "+sum);
        sc.close();
    }
}
