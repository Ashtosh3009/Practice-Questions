// W.A.P. to input a number and print it's total number of odd digits
import java.util.*;
public class Total_Number_Of_Odd_Digits {
    public static void main(String args[])
    {
        int n,d,c=0;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        while(n>0)
        {
            d= n%10;
            if(d%2!=0)
            c++;
            n/=10;
        }
        System.out.println("Total number of odd digits : "+c);
        sc.close();
    }
}
