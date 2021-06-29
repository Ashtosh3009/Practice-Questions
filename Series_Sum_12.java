// W.A.P. to input two numbers and print the sum of the following series :
// S = 2x - 3x/2 + 4x/3 ...... (n+1)x/n
import java.util.*;
public class Series_Sum_12 {
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int x,n,i,sign=1;
        double s=0.0;
        System.out.print("Enter two number : ");
        x = sc.nextInt();
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            s = s + (double)(i+1)*x/i*sign;
            sign*=-1;
        }
        System.out.println("Sum = "+s);
        sc.close();
    }
}
