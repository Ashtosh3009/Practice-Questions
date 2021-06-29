// W.A.P. to print following series : 
// 2 4 6 ...... n
import java.util.*;
public class Series_1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n,i;
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        System.out.print("Series : ");
        for(i=1 ; i<=n ; i++)
        {
            System.out.print((i*2)+" ");
        }
        System.out.println();
    }
}
