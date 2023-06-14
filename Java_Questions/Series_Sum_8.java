// W.A.P. to input two numbers and print the sum of the following series :
// S = 1-2+3-4....n
import java.util.*;
public class Series_Sum_8 {
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n,sign=1,sum=0,i;
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            sum = sum + i * sign;
            sign = sign * -1;
        }
        System.out.println("Sum = "+sum);
    }
}
