// Write a program to check whether the number is Palindrome Number or not.
import java.util.*;
public class Palindrome_Numbers {
    int t, d, rev=0;
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n, result;
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        Palindrome_Numbers ob = new Palindrome_Numbers ();
        result = ob.is_Palin(n);
        if(result == 1)
        {
            System.out.println("It's a Palindrome Number");
        }
        else
        {
            System.out.println("It's not a Palindrome Number");
        }
    }
    int is_Palin(int n)
    {
        t = n;
        while(t>0)
        {
            d = t % 10;
            rev = rev * 10 + d;
            t = t / 10;
        }
        if(rev == n)
        return 1;
        else
        return 0;
    }
}