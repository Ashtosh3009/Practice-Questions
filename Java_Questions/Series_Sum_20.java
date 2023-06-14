// W.A.P. to input two numbers and print the sum of the following series :
// S = 1 - x/2 + x^2/3 .... x^n/(n+1)
import java.util.*;
public class Series_Sum_20 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter two number : ");
        int i,x,n,sgn=-1;
        double sum=1.0;
        x = sc.nextInt();
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            sum += Math.pow(x,i)/(i+1) * sgn;
            sgn *= -1;
        }
        System.out.println("Sum = "+sum);
        sc.close();
    }
}
