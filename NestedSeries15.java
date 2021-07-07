// S = 1 - (1-2) + (1-2+3) - ...... (1-2+3-4....n)
import java.util.*;
public class NestedSeries15 {
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n,i,j, s=0, sum=0, sgn, sign=1;
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            s=0;
            sgn = 1;
            for(j=1 ; j<=i ; j++)
            {
                s = s + j * sgn;
                sgn *= -1;
            }
            sum = sum + s * sign;
            sign *= -1;
        }
        System.out.println("Sum = "+sum);
        sc.close();
    }
}
