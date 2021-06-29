// W.A.P. to input a number and print the following series:
// 1 3 5 .... n
import java.util.*;
public class Series_2 {
    public static void main (String args[])
    {
        int n,i;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        n=sc.nextInt();
        System.out.print("Series : ");
        for(i=1 ; i<=n ; i+=2)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        sc.close();
    }
}
