// W.A.P. to input two numbers and print the sum of following series
// S = x + x/2 + x/3 ...... x/n
import java.util.*;
public class Series_Sum_2 {
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int x,n,i;
        double s=0.0;
        System.out.print("Enter two numbers : ");
        x = sc.nextInt();
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            s = s + x/i;
        }
        System.out.println("Sum = "+s);
        sc.close();
    }
}
