// W.A.P. to input two numbers and print the sum of the following series :
// S = x - 2/x^2 + x^3/3 - 4/x^4 ....... n terms
import java.util.*;
public class Series_Sum_24 {
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int x,n,i,sgn=1;
        double s=0.0;
        System.out.print("Enter two numbers : ");
        x=sc.nextInt();
        n=sc.nextInt();
        for ( i = 1 ; i<=n ; i++)
        {
            s = s + Math.pow( Math.pow(x,i)/(double)i , sgn) * sgn ; 
            sgn *= -1;
        }
        System.out.println("Sum = "+s);
        sc.close();
    }
}
