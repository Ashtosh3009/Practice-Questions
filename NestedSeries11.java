// S = 1 - (x+1)!/5 + (x+2)!/10 - (x+3)!/15 ....... (x+n)!/m
import java.util.*;
public class NestedSeries11 {
    public static void main (String args[])
    {
        int f,i,j,x,n,m=5,sgn=-1;
        double sum=1.0;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter X and N : ");
        x = sc.nextInt();
        n = sc.nextInt();
        for(i=1 ; i<=n ; i++)
        {
            f=1;
            for(j=1 ; j<=(x+i) ; j++)
            {
                f = f * j;
            }
            sum += (double)f/(double)m*(double)sgn;
            m += 5;
            sgn *= -1;
        }
        System.out.println("Sum = "+sum);
        sc.close();
    }
}
