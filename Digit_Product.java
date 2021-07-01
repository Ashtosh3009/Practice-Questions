// W.A.P. to input a number and print it's digit product
import java.util.*;
public class Digit_Product {
    public static void main(String args[])
    {
        int n,d,f=1;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number = ");
        n = sc.nextInt();
        while(n>0)
        {
            d=n%10;
            f*=d;
            n/=10;
        }
        System.out.println("Product of digit : "+f);
        sc.close();
    }
}
