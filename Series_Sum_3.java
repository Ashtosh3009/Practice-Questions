// W.A.P. to input two numbers and print the sum of the following series :
// S = x + 2x + 3x ...... nx
import java.util.*;
public class Series_Sum_3 {
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n,x,sum=0,i;
        System.out.print("Enter two numbers : ");
        n = sc.nextInt();
        x = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            sum += i *x;
        }
        System.out.println("Sum = "+sum);
        sc.close();
    }
}
