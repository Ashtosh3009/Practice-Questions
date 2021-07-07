// S = 1 + (1+2) + (1+2+3) + (1+2+3+4) + ....... + (1+2+3+...+n)
import java.util.*; 
public class NestedSeries12 {
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n,i,j,s=0;
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        for(i=1 ; i<=n ; i++)
        {
            for(j=1 ; j<=i ; j++)
            {
                s += j;
            }
        }
        System.out.println("Sum = "+s);
        sc.close();
    }
}
