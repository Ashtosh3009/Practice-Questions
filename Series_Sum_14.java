// W.A.P. to input two numbers and print the sum of the following series :
// S = x - 2x + 3x ..... nx
import java.util.*;
public class Series_Sum_14 {
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n,x,i,sign=1,s=0;
        System.out.print("Enter two numbers : ");
        n = sc.nextInt();
        x = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            s=s + i*x*sign;
            sign*=-1;
        }
        System.out.println("Sum = "+s);
        sc.close();
    }
}
