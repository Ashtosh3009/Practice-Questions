// W.A.P. to input two numbers and print the sum of the following series :
// S = 2-4+6-8....n
import java.util.*;
public class Series_Sum_10 {
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n,i,s=0,sign=1;
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        for(i=2;i<=n;i+=2)
        {
            s=s+i*sign;
            sign*=-1;
        }
        System.out.println("Sum = "+s);
        sc.close();
    }
}
