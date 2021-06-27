//W.A.P. to input 3 numbers and print them in ascending order.
import java.util.*;
public class Ascending_Order {
    public static void main(String args[])
    {
        int a,b,c,max,min,mid;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b && a>c)
        max=a;
        else if(b>a && b>c)
        max=b;
        else
        max=c;

        if(a<b && a<c)
        min=a;
        else if(b<a && b<c)
        min=b;
        else
        min=c;
        mid=(a+b+c)-(max+min);
        System.out.println("Ascending Order : "+min+" "+" "+mid+" "+max);
    }
}
