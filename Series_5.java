//W.A.P. to input a number and print the following series : 
// 1 5 9 13 ..... n
import java.util.*;
public class Series_5 {
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n,i;
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        for(i=1;i<=n;i+=4)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        sc.close();
    }
}
