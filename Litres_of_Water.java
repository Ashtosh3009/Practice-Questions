/**
 * W.A.P. to input number of litres and print total cost by checking the  rate as follows:
 * No. of Litres     Rate
 * 1-500             0.50
 * 501-1000          0.60
 * 1001-2000         0.70
 * >2000             0.80
 */
import java.util.*;
public class Litres_of_Water {
    public static void main(String args[])
    {
        int l;
        double r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value in litres : ");
        l=sc.nextInt();
        if(l>=1 && l<=500)
        {
            r = 0.50*l;
        }
        else if(l>=501 && l<=1000)
        {
            r = 0.50*500 + 0.60*(l-500);
        }
        else if(l>=1001 && l<=2000)
        {
            r = 0.05*500 + 0.60*500 + 0.70*(l-1000);
        }
        else 
        {
            r = 0.50*500 + 0.60*500 + 0.70*1000 + 0.80*(l-2000);
        }
        System.out.println("Total cost : "+r);
    }
}