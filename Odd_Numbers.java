// W.A.P. to print all odd numbers from a to b.
import java.util.*;
public class Odd_Numbers {
    public static void main(String args[])
    {
        int a, b, i; 
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter A and B : ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.print("Odd Numbers : ");
        for(i=a;i<=b;i++)
        {
            if(i%2!=0)
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
