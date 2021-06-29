// W.A.P. to input a number and print its odd factors
import java.util.*;
public class Odd_Factors {
    public static void main (String args[])
    {
        int i,n;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        System.out.print("Odd factors : ");
        for(i=1;i<=n;i++)
        {
            if(n%i==0 && i%2!=0)
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
        sc.close();
    }
}
