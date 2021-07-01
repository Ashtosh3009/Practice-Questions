// W.A.P. to input two numbers and print its L.C.M.
// Example : 20,12 -> 60 
import java.util.*;
public class L_C_M {
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int a,b,hcf=0,lcm;
        System.out.print("Enter two numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        int low = a<b?a:b;
        int i=1;
        while(i<=low)
        {
            if(a%i==0 && b%i==0)
            {
                hcf=i;
            }
            i++;
        }
        lcm = a*b/hcf;
        System.out.println("L.C.M. = "+lcm);
        sc.close();
    }
}