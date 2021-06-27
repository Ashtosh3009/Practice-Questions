/**
 * W.A.P. to input number of calls and print total cost by checking the  rate as follows:
 * No. of Calls      Rate
 * First 100         1.5
 * Next 200          1.25
 * Next 300          0.80
 *  >600             0.40
 */
/**
 * W.A.P. to input number of calls and print total cost by checking the  rate as follows:
 * No. of Calls     Rate
 * 1-200            2
 * 201-350          1.5
 * 351-500          1
 * >500             0.5
 */
import java.util.*;
public class Calls {
    public static void main(String args[])
    {
        int call;
        double r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of calls : ");
        call=sc.nextInt();
        if(call>=1 && call<=200)
        r=2*call;
        else if(call>=201 && call<=350)
        r=2*200+1.5*(call-200);
        else if(call>=351 && call<=500)
        r=2*200+1.5*150+1*(call-350);
        else
        r=2*200+1.5*150+1*150+0.5*(call-500);
        System.out.println("Total Cost = "+(r));
    }
}
