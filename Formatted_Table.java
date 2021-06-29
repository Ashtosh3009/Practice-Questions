/**
 * W.A.P. to input a number and print its well formatted table.
 * For example : 
 *      3 x 1 = 3
 *      3 x 2 = 6
 *         |
 *         |
 *      3 x 10 = 30
 */
import java.util.*;
public class Formatted_Table {
    public static void main (String args[])
    {
        int n, i;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number = ");
        n = sc.nextInt();
        for ( i = 1 ; i <= 10 ; i++ )
        {
            System.out.println(n+" x "+i+" = "+(n*i));
        }
        sc.close();
    }
}
