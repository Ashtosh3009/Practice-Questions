/**W.A.P. to input number of days, type and floor number and print the bill.
 *      A/C     Non-A/C
 * 0    2000    1000
 * 1    1600     800
 * 2    1200     600
 * charge = net * days
 */
import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class Bill_charge
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A for A/C or N for Non-A/C : ");
        int f,day,net,charge;
        char t=sc.next().charAt(0);
        System.out.print("Enter Floor Number : ");
        f=sc.nextInt();
        System.out.print("Enter Number of Days : ");
        day=sc.nextInt();
        if(t=='a' || t=='A')
        {
            if(f==0)
            net=2000;
            else if(f==1)
            net=1600;
            else if(f==2)
            net=1200;
            else 
            {
                net = 0;
                System.out.println("Wrong Choice!!!");
            }   
        }   
        else if(t=='N'||t=='n')
        {
            if(f==0)
            net=1000;
            else if(f==1)
            net=800;
            else if(f==2)
            net=600;
            else 
            {
                net=0;
                System.out.println("Wrong Choice!!!");
            }
        }
        else 
        {
            net=0;
            System.out.println("Wrong Choice");
        }
        charge=net*day;
        System.out.println("Total Bill : "+charge);
    }
}