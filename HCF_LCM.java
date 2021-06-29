// W.A.P. to input two numbers and print its H.C.F. and L.C.M.
import java.util.*;
public class HCF_LCM {
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter two numbers : ");
        int hcf=1;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mini = Math.min(a,b);
        for(int i=1 ; i<=mini ; i++)
        {
            if(a%i==0 && b%i==0)
            hcf = i;
        }
        int lcm = (a*b)/hcf;
        System.out.println("HCF = "+hcf+"\nLCM = "+lcm);
        sc.close();
    }
}
