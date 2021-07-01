//W.A.P. to input two numbers and print its H.C.F. using long division method.
import java.util.*;
public class Long_division_Method {
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int a,b,max,min,d=1;
        System.out.print("Enter two numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        max = a>b ? a : b;
        min = a+b-max;
        while(d!=0)
        {
            d=max%min;
            max=min;
            min=d;
        }
        System.out.println("H.C.F. = "+max);
        sc.close();
    }
}
