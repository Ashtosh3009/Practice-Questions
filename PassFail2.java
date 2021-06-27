//W.A.P. to print whether student is pass or fail within 3 subjects
import java.util.*;
public class PassFail2 {
    public static void main(String args[])
    {
        int m1,m2,m3;
        double avg;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 subjects : ");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        avg=(m1+m2+m3)/3.0;
        if(avg>40)
        System.out.println("Pass");
        else
        System.out.println("Fail");
    }
}
