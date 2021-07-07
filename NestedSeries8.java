// S = x - (x^2)/(2!) + (x^3)/(3!) - (x^4)/(4!) ..... (x^n)/(n!)
import java.util.*;
public class NestedSeries8 {
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int x,n,i,j,f,sgn=1;;
        double sum=0.0;
        System.out.print("Enter X and N :");
        x = sc.nextInt();
        n = sc.nextInt();
        for(i=1 ; i<=n ; i++)
        {
            f=1;
            for(j=1; j<=i ; j++)
            {
                f = f * j;
            }
            sum = sum + Math.pow(x,i)/f * sgn;
            sgn *= -1;
        }
        System.out.println("Sum = "+sum);
        sc.close();
    }
}
