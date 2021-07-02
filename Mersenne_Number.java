 //W.A.P. to input a number and check whether it is Mersel number or not.
// where mersel number --->  n=(2^p)-1
import java.util.*;
public class Mersenne_Number {
    public static void main (String args[])
    {
        int i=1,m=0,n;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        while(m<=n)
        {
            m=(int)Math.pow(2,i)-1;
            if(m==n)
            {
                System.out.println("Mersenne Number");
                break;
            }
            else if(m>n)
            {
                System.out.println("Not a Mersenne Number");
                break;
            }
            else 
            i++;           
        }
    }
}