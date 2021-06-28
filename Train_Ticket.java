/**W.A.P. to input age of Passenger and Distance covered by train and print the bill.
 * Age      Distance        Ticket/km
 * 1-5      upto 3 km       0
 *          upto 10 km      2
 *          > 10 km         5
 * 6-50     upto 3 km       5
 *          upto 10 km      10
 *          > 10 km         20
 * >50      upto 3 km       3
 *          upto 10 km      8
 *          > 10 km         15
 */
import java.util.*;
public class Train_Ticket {
    public static void main(String []args)
    {
        int age,dis,tic;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter age : ");
        age=sc.nextInt();
        System.out.print("Enter Distance : ");
        dis=sc.nextInt();
        if(age>=1 && age<=5)
        {
            if(dis<=3)
            tic=0;
            else if(dis<=10)
            tic=2;
            else 
            tic=5;
        }
        else if(age>=6 && age<=50)
        {
            if(dis<=3)
            tic=5;
            else if(dis<=10)
            tic=10;
            else 
            tic=20;
        }
        else
        {
            if(dis<=3)
            tic=3;
            else if(dis<=10)
            tic=8;
            else 
            tic=15;
        }
        System.out.println("Total charge : Rs."+tic);
    }
}
