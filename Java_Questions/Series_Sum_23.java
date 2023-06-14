// W.A.P. to input two numbers and print the sum of the following series :
// S = 1/a - 1/(a+b) + 1/(a+2b) ..... (1/(a+nb))
import java.util.*;
public class Series_Sum_23 {
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n,a,b,i,sgn=1;
        double s=0;
        System.out.print("Enter three numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        n = sc.nextInt();
        for(i=0;i<=n;i++)
        {
            s+=1.0 / ( a + i * b ) * sgn;
            sgn*=-1;
        }
        System.out.println("Sum = "+s);
        sc.close();
    }
}
