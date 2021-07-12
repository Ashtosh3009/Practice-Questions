// Write a program to create a function void isPalin() to input a number and display whether 
// number is Palindrome Number or not. Also write main() method.
import java.util.*;
class Palin_Number {
    int rev=0,n,d,t;
    void get()
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
    }
    void isPalin()
    {
        t = n;
        while(t>0)
        {
            d = t % 10;
            rev = rev * 10 + d;
            t /= 10;
        }
        if(rev == n)
        System.out.println("It's a Palindrome Number");
        else
        System.out.println("It's not a Palindrome Number");
    }
    public static void main (String args[])
    {
        Palin_Number ob = new Palin_Number ();
        ob.get();
        ob.isPalin();
    }
}
