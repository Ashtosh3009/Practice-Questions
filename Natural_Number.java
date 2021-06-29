//W.A.P. to print first n natural numbers.
import java.util.*;
public class Natural_Number {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int i;
        int n = sc.nextInt();
        for (i=0 ; i < n ; i++)
        {
            System.out.println(i+1);
        }
        sc.close();
    }
}
