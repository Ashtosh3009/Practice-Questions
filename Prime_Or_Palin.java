// Write a program to create :
// isPrime() - check whether number is Prime Number or not.
// isPalin() - check whether number is Palindrome Number or not.
// Also write main() method.
import java.util.*;
class Number
{
    int i,c=0,y,rev=0,d,t;
    public static void main (String args[])
    {
        Number ob = new Number();
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        ob.isPrime(n);
        ob.isPalin(n);
        sc.close();
    }
    void isPrime(int n)
    {
        for(i=1 ; i<=n ; i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==2)
        System.out.println("It's a Prime Number");
        else
        System.out.println("It's not a Prime Number");
    }
    void isPalin(int n)
    {
        t = n;
        while(t>0)
        {
            d = t % 10;
            rev = rev * 10 + d;
            t = t / 10;
        }
        if(rev==n)
        System.out.println("It's a Palindrome Number");
        else
        System.out.println("It's not a Palindrome Number");
    }
}