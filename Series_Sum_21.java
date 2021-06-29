// W.A.P. to input two numbers and print the sum of the following series :
// S = 1 + x + x^2 ........x^n
import java.util.*;
public class Series_Sum_21 {
    public static void main (String args[])
    {
        int x,n,i,s=1;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter two numbers : ");
        x = sc.nextInt();
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            s+=Math.pow(x,i);
        }
        System.out.println("Sum = "+s);
        sc.close();
    }
}
