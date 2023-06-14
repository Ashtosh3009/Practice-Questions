// W.A.P. to inout a number and print its maximum digit
import java.util.*;
public class maximum_digit {
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n,d,max=0;
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        do
        {
            d = n % 10;
            max = Math.max(max,d);
            n/=10;
        }
        while(n>0);
        System.out.println("Maximum digit = "+max);
        sc.close();
    }
}
