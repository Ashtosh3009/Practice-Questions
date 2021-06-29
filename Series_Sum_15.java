// W.A.P. to input two numbers and print the sum of the following series :
// S = 1/(a+b) - 1/(a+2b) + 1/(a+3b) ........ 1(a+nb)
import java.util.*;
public class Series_Sum_15 {
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int a,b,n,i,sgn=1;
        double sum=0.0;
        System.out.println("Enter three numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        n = sc.nextInt();
        for(i=1 ; i<=n ; i++)
        {
            sum += 1.0/(a + i*b)*sgn;
            sgn*=-1;
        }
        System.out.println("Sum = "+sum);
        sc.close();
    }
}
