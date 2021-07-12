// Write a program to check and print whether the number is Armstrong number or not.
// Method :> char isArm(int n)
import java.util.*;
class Armstrong_Numbers
{
    public static void main (String args[])
    {
        int n;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number = ");
        n = sc.nextInt() ;
        Armstrong_Numbers ob = new Armstrong_Numbers();
        char check = ob.isArm(n);
        if(check == ('T'))
        {
            System.out.println("It's an Armstrong Number");
        }
        else
        {
            System.out.println("It's not an Armstrong Number");
        }
        sc.close();
    }
    char isArm (int n)
    {
        int t,d,res=0;
        t = n;
        while(t>0) 
        {
            d = t % 10;
            res = res + d*d*d;
            t /= 10;
        }
        if(res == n)
        {
            return 'T';
        }
        else
        {
            return 'f';
        }
    }
}
