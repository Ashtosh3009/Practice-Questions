/**W.A.P. to input a number and chexk whether it is Perfect Number or Not.
 * Factors sum = 2 * number.
 */
import java.util.*;
public class Perfect_Number {
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int i,sum=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            sum = sum + i;
        }
        if(sum == (2*n))
        System.out.println("Perfect Number");
        else
        System.out.println("Not a Perfect number");
        sc.close();
    }
}
