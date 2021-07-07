// S = x + (2x)/3! + (3x)/5! + (4x)/7! + ....... + (nx)/(2n-1)!
import java.util.*;
public class NestedSeries5 {
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int f,x,n,i,j;
        double sum=0.0;
        System.out.println("Enter two numbers : ");
        x = sc.nextInt();
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            f=1;
            for(j=1; j<=(2*i-1) ;j++)
            {
                f=f*j;
            }
            sum = sum + (double)(i*x)/(double)f;
        }
        System.out.println("Sum = "+sum);
        sc.close();
    }
}
