// W.A.P. to input a number and print the total number of digits present in it.
import java.util.*;
public class Total_Number_Of_Digits {
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n,i=0;
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        while(n>0)
        {
            i++;
            n=n/10;
        }
        System.out.println("Number of digits = "+i);
    }
}
