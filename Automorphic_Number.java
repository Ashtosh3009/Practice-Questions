// Write a program to check and print whether the number is Automorphic number or not.
// Method :> boolean isAuto(int n)
import java.util.*;
class Automorphic
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number = ");
        int n = sc.nextInt();
        Automorphic ob = new Automorphic();
        boolean check = ob.isAuto(n);
        if(check == true)
        {
            System.out.println("It's an Automorphic number");
        }
        else
        {
            System.out.println("It's not an Automorphic Number");
        }
    }
    boolean isAuto(int n)
    {
        int t=n, s=n*n, c=0, check;
        while(t>0)
        {
            c++;
            t=t/10;
        } 
        check = s % (int)Math.pow(10,c);
        if(check == n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
