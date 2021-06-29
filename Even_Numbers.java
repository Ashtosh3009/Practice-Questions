//W.A.P. to print all even numbers from 1 to n.
import java.util.*;
public class Even_Numbers {
    public static void main(String args[])
    {
    Scanner sc = new Scanner (System.in);
    int i,n;
    System.out.print("Enter a number : ");
    n=sc.nextInt();
    System.out.println("Even Numbers : ");
    for(i=2;i<=n;i+=2)
    {
        System.out.println(i);
    }
    sc.close();
}
}
