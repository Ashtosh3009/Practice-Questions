// W.A.P. to input a number and check whether it is Automorphic number or not.
// Example : 625 -> 25 , 36 -> 6
import java.util.*;
public class Automorphic_Number {
    public static void main (String args[])
    {
        int n,t,s,c=0,m;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        s=n*n;
        t=n;
        while(t>0)
        {
            c++;
            t/=10;
        }
        m = s % (int)Math.pow(10,c);
        if(m == n)
        System.out.println("Automorphic Number");
        else
        System.out.println("Not Automorphic Number");
        sc.close(); 
    }
}
