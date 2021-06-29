// W.A.P. to print the sum of the following series
// S = x + x^2 + x^3 ....... x^n
import java.util.*;
public class Series_Sum_1 {
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int s=0,x,n,i;
        System.out.print("Enter two numbers : ");
        x = sc.nextInt();
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            s = s + (int)Math.pow(x,i);
        }
        System.out.println("Sum = "+s);
    }
}
