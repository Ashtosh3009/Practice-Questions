// W.A.P. to input two numbers and print the sum of the following series :
// S = 1-3+5-7....n
import java.util.*;
public class Series_Sum_9 {
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n,i,sign=1,sum=0;
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        for(i=1;i<=n;i+=2)
        {
            sum+=i*sign;
            sign*=-1;
        }
        System.out.println("Sum = "+sum);
    }
}
