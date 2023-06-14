// W.A.P. to print the sum of first n natural numbers.
import java.util.*;
public class Sum_of_natural_numbers {
    public static void main (String args[])
    {
        int sum=0,i,n;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        for ( i = 1 ; i <= n ; i++ )
        {
            sum = sum + i ;
        }
        System.out.println("Sum = "+sum);
        sc.close();
    }
}
