/** W.A.P. to input a number and check whether it is Prime Number or not
 * Definition : Numbers having twofactors
 */
import java.util.*;
public class Prime_Number_Or_Not {
    public static void main(String args[])
    {
        int n,c=0,i;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==2)
        System.out.println("Prime number");
        else
        System.out.println("Not prime Number");
    }
}
