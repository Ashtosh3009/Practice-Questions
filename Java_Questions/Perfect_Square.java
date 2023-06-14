// W.A.P. to input a number and check whether it is a Perfect Square or not.
//  9 = (3)^2 :: proper integer
import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class Perfect_Square {
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n;
        System.out.print("Enter a number : ");
        n = sc.nextInt();
        int s=0,i=1;
        while(s<=n)
        {
            s=i*i;
            if(s==n)
            {
                System.out.println("Perfect Square");
                break;
            }
            else if (s>n)
            {
                System.out.println("Not a Perfect Square");
                break;
            }
            else 
            {
                i++;
            }
        }
        sc.close();
    }
}
