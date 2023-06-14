// W.A.P. to input two numbers and print the sum of the following series :
// S = 1 + 2 + 3 ..... + n.
import java.util.*;
public class Series_Sum_6 {
    public static void main (String args[])
    {
        int n,i;
        double sum = 0.0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println("Sum = "+sum);
    }
}
