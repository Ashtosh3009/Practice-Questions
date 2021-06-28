//Input number from 1 to 10 and print whether number is Even or Odd.
import java.util.*;
public class EvenOdd {
    public static void main(String []args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        switch(n)
        {
            case 2:
            case 4:
            case 6:
            case 8:
            case 10: System.out.println("Even Number");
            break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 9: System.out.println("Odd Number");
            break;
            default: System.out.println("Wrong Choice!!!");
        }
    }
}
