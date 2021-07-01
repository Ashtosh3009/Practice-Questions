//  W.A.P. to input a number and print it in reverse
import java.util.*;
public class Reverse {
    public static void main (String args[])
    {
        int n,rev=0,d;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        while(n>0)
        {
            d=n%10;
            rev= rev*10 + d ;
            n/=10;
        }
        System.out.println("Reverse number : "+rev);
        sc.close();
    }
}
