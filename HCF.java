// Write a program to create a function void hcf() to input two numbers and display hcf of them.
// Also write main() method.
import java.util.*;
public class HCF {
    int i,min,hcf;
    public static void main (String args[])
    {
        int a,b;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter two numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        HCF ob = new HCF();
        ob.hcf(a,b);
    }
    void hcf(int a, int b)
    {
        min = a < b ? a : b;
        for( i=1 ; i<=min ; i++)
        {
            if(a%i==0 && b%i==0)
            hcf = i;
        }
        System.out.println("HCF of them is "+hcf);
    }
}