// W.A.P. to input two numbers and print the sum of the following series :
// S = 1 + x + x/2 +.....x/n
import java.util.*;
public class Series_Sum_17 {
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int x,n,i;
        double s=1.0;
        System.out.print("Enter two numbers : ");
        x = sc.nextInt();
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            s=s+(double)x/i;
        }
        System.out.println("Sum = "+s);
        sc.close();
    }
}
