/**
 * W.A.P. to input number of units and print total cost by checking the  rate as follows:
 * No. of Units     Rate
 * 1-50             5
 * 51-150           7
 * 151-300          10
 * >300             12
 */
import java.util.*;
public class Units {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int u,r;
        System.out.print("Enter number of units : ");
        u=sc.nextInt();
        if(u>=1 && u<=50)
        r=5*u;
        else if(u>=51 && u<=150)
        r=5*50 + 7*(u-50);
        else if(u>=151 && u<=300)
        r= 5*50 + 7*100 + 10*(u-150);
        else 
        r= 5*50 + 7*100 + 10*150 + 12*(u-300);
        System.out.println("Total Cost = "+r);
    }
}
