// W.A.P. to input a number and print the product of largest and smallest digit.
import java.util.*;
public class Product_of_largest_smallest {
    public static void main (String args[])
    {
        int n,d=0,l=0,s=9;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        n=sc.nextInt();
        while(n>0)
        {
            d=n%10;
            if(d>l)
            {
                l=d;
            }
            if(d<s)
            {
                s=d;
            }
            n=n/10;
        }
        System.out.println("Product = "+(l*s));
        sc.close();
    }
}
