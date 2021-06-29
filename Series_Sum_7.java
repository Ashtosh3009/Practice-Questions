// W.A.P. to input two numbers and print the sum of the following series :
// S = 1/2 + 2/3 + 3/4 + ..... + n/n+1
import java.util.*;
public class Series_Sum_7 {
    public static void main(String args[])
    {
        int n,i;
        double s=0.0;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number = ");
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            s =s + i/(i+1.0);
        }
        System.out.println("Sum = "+s);
        sc.close();
    }
}
