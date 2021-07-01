// W.A.P. to input a number and print maximum digit
import java.util.*;
public class maximum_digit {
    public static void main(String args[])
    {
        int n,d,ma=0;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        while(n>0)
        {
            d=n%10;
            if(d>ma)
            ma=d;
            n/=10;
        }
        System.out.println("Maximum digit : "+ma);
        sc.close();
    }
}
