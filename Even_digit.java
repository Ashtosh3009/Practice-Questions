// W.A.P. to input a number and print it's even digits
import java.util.*;
public class Even_digit {
    public static void main(String args[])
    {
        int n,d;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        System.out.print("Even digits : ");
        while(n>0)
        {
            d = n % 10;
            if (d%2==0)
            System.out.print(d+" ");
            n/=10;
        }
        System.out.println();
        sc.close();
    }
}