/**
 * W.A.P. to input a number and print its factorial.
 * Ex: Input =3
 *     Process=1x2x3
 */
import java.util.*;
public class Factorial {
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int f=1,n,i;
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            f = f * i;
        }
        System.out.println("Factorial = "+f);
        sc.close();
    }
}