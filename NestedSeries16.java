// S = (1+2)/(1*2) - (1+2+3)/(1*2*3) + (1+2+3+4)/(1*2*3*4) + (1+2....n)/(1*3....n)
import java.util.*;
class NestedSeries16
{
    public static void main (String args[])
    {
        int n,j,i,s,f,sign=1;
        double sum=0.0;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        for(i=2;i<=n;i++)
        {
            s = 0;
            f = 1;
            for(j=1;j<=i;j++)
            {
                s = s + j;
                f = f * j;
            }
            sum = sum + (double)s/f * sign;
            sign*=-1;
        }
        System.out.println("Sum = "+sum);
        sc.close();
    }
}