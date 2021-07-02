// W.A.P. to input a number and print its even digits
import java.util.*;
public class Even_digit {
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number : ");
        int n,d;
        n = sc.nextInt();
        do
        {
            d = n % 10;
            if(d%2==0)
            {
                System.out.print(d+" ");
            }
            n/=10;
        }
        while(n>0);
        System.out.println();
        sc.close();
    }
}
