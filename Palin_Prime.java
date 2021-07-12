// Write a program to perform following function.
// Method-1 :> boolean isPalin (int n)
// Method-2 :> char is_Prime (int n)
// Also use main() method.
import java.util.*;
class Palin_Prime 
{
    int t,rev=0,d,i,c;
    boolean isPalin (int n)
    {
        t = n;
        while(t>0)
        {
            d = t % 10;
            rev = rev * 10 + d;
            t /= 10;
        }
        if(n == rev)
        return true;
        else
        return false;
    }
    char is_Prime(int n)
    {
        c = 0;
        for(i=1 ; i<=n ; i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==2)
        return 't';
        else
        return 'f';
    }
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        Palin_Prime ob = new Palin_Prime();
        boolean Palin = ob.isPalin(n);
        char Prime = ob.is_Prime(n);
        if(Palin == true)
        System.out.println("It's a Palindrome Number");
        else
        System.out.println("It's not a Palindrome Number");
        
        if(Prime == 't')
        System.out.println("It's a Prime Number");
        else
        System.out.println("It's not a Prime Number");

        sc.close();
    }    
}
