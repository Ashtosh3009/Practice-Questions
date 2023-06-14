/*
Write a program to perform following functions and also call them all, using main() method.
void sumSeries (int n) :- S = 1 - 1/2 + 1/3 - 1/4 .... n terms
void sumSeries() :- S = 1! + 2! + 3! ..... 20!
*/
import java.util.*;
public class Sum_series_overloading 
{
    int i,j,sign=1,f;
    double sum;
    void sumSeries(int n)
    {
        sum = 0.0;
        for (i=1 ; i<=n ; i++)
        {
            sum += 1.0/i * sign;
            sign *= -1;
        }
        System.out.println("Sum Of Series 1 = "+sum);
    }    
    void sumSeries()
    {
        sum = 0.0;
        for(i=1 ; i<=20 ; i++)
        {
            f = 1;
            for (j=1 ; j<=i ;j++)
            {
                f *= j;
            }
            sum += f;
        }
        System.out.println("Sum Of Series 2 = "+sum);
    }
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        Sum_series_overloading ob = new Sum_series_overloading();
        System.out.print("\nEnter a number for 1st Series : ");
        int n = sc.nextInt();
        ob.sumSeries(n);
        ob.sumSeries();
        sc.close();
    }
}
