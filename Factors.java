// W.A.P. to input a number and print all its factors.
import java.util.*;
public class Factors {
    public static void main (String args[])
    {
        int i,n;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        System.out.print("Factors : ");
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
