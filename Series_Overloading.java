/*
Write a program to perform following functions and also call them all, using main() method.
double series (double n) : S = 1 + 1/2 + 1/3 + 1/4 + ..... + 1/n
double series (double a , double n) : S = 1/a^2 + 4/a^5 + 7/a^8 + 10/a^11 ....... n terms
*/
import java.util.*;
public class Series_Overloading 
{
    int m,i;
    double sum=0.0;
    double series (double n)
    {
        
        for(i=1 ; i<=n ; i++)
        {
            sum = sum + 1.0/i;
        }
        return sum;
    }    
    double series (double a , double n)
    {
        m = 1;
        sum = 0.0;
        for (i=1 ; i<=n ;i++)
        {
            sum = sum + m/Math.pow(a,(m+1));
            m = m +3;
        }
        return sum;
    }
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        Series_Overloading ob = new Series_Overloading();
        System.out.print("\nEnter one value for Series 1 : ");
        double N,a,n,sum1,sum2;
        N = sc.nextDouble();
        sum1 = ob.series(N);
        System.out.println("Sum of Series 1 = "+sum1);
        System.out.print("\nEnter two values for Series 2 : ");
        a = sc.nextDouble();
        n = sc.nextDouble();
        sum2 = ob.series(a,n);
        System.out.println("Sum of Series 2 = "+sum2);
        sc.close();
    }
}
