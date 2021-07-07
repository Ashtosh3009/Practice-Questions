// S = 1 + (1-2) + (1-2+3) + ..... + (1-2+3-4....n)
import java.util.*;
public class NestedSeries14 {
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n,i,j,sgn,s,sum=0;
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        for(i=1 ; i<=n ;i++)
        {
            sgn = 1;
            s = 0;
            for (j=1 ; j<=i ;j++)
            {
                s = s + j * sgn;
                sgn = sgn * -1;
            }
            sum += s;   
        }
        System.out.println("Sum = "+sum);
        sc.close();
    }
}
