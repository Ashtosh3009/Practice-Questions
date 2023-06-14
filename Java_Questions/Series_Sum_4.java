// W.A.P. to input two numbers and print the sum of the following series :
// S = x + x^2/4 + x^3/9 ..... x^n/n^2
import java.util.*;
public class Series_Sum_4 {
    public static void main (String args[])
    {
        double s=0.0;
        int x,n,i;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter two numbers : ");
        x = sc.nextInt();
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            s = s + Math.pow(x,i) / Math.pow(i,2);
        }
        System.out.println("Sum = "+s);
    }
}
