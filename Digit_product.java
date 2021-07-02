// W.A.P. to input a number and print its digit's product
import java.util.*;
public class Digit_product {
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int f=1,d;
        do
        {
            d = n % 10;
            f = f * d;
            n/=10;
        }while(n>0);
        System.out.println("Product = "+f);
        sc.close();
    }
}