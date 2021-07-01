// W.A.P. to input a number and check whether it is Palindrome Number or not.
import java.util.*;
public class Palindrome_Number {
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n,rev=0,d,t;
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        t = n;
        while(t>0)
        {
            d = t % 10;
            rev = rev * 10 + d; 
            t /= 10;
        }
        if(rev == n)
        System.out.println("Palindrome Number");
        else
        System.out.println("Not a Palindrome Number");
        sc.close();
    }
}
