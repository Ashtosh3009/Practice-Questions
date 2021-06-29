// W.A.P. to input two numbers and print the sum of the following series :
// S = 1 + x + x^3/2 + x^5/3 + .... + x^(2n-1)/n
import java.util.*;
public class Series_Sum_18 {
    public static void main(String args[])
    {
        int x,n,i;
        double s=1.0;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter two number : ");
        x = sc.nextInt();
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            s = s + Math.pow(x, (2*i-1))/i;
        }
        System.out.println("Sum = "+s);
        sc.close();
    }
}
