// W.A.P. to input a number and print the sum of its digits.
import java.util.*;
public class Sum_of_digits {
    public static void main (String args[])
    {
        int n,d,sum=0;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number = ");
        n = sc.nextInt();
        while(n>0)
    {
        d=n%10;
        sum+=d;
        n/=10;
    }
System.out.println("Sum = "+sum);    
sc.close();}
}
