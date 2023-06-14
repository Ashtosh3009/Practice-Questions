// W.A.P. to input two numbers and print the sum of the following series :
// S = 1 + x - 2x + 3x ....... nx
import java.util.*;
public class Series_Sum_22 {
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int x,n,i,sgn=1,s=1;
        System.out.print("Enter two numbers : ");
        x = sc.nextInt();
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            s += i*x*sgn;
            sgn *= -1;
        }        
        System.out.println("Sum = "+s);
        sc.close();
    }
}
