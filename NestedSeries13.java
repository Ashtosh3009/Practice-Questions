// S = 1 - (1+2) + (1+2+3) - ....... (1+2+3....n)
import java.util.*;
public class NestedSeries13 {
    public static void main (String args[])
    {
        int n,s=0,sum=0,sgn=1,i,j;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        for(i=1 ; i<=n ; i++)
        {
            s=0;
            for(j=1 ; j<=i ; j++)
            {
                s = s + j;
            }
            sum = sum + s * sgn;
            sgn = sgn * -1;
        }
        System.out.println("Sum = "+sum);
        sc.close();
    }
}
