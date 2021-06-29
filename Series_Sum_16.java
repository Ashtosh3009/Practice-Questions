// W.A.P. to input two numbers and print the sum of the following series :
// S = 1+x+2x+.....+nx
import java.util.*;
public class Series_Sum_16 {
    public static void main (String args[])
    {
        int n,x,s=1,i;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter two number : ");
        n = sc.nextInt();
        x = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            s = s + i * x;
        }
        System.out.println("Sum = "+s);
    }
}
