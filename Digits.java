//W.A.P. to input a number and check whether it is one digit, 2 digit, 3 digit or more than 3 digit.
import java.util.*;
public class Digits {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a number : ");
        n=sc.nextInt();
        if(n>=-9 && n<=9)
        System.out.println("One Digit");
        else if(n>=-99 && n<=99)
        System.out.println("Two Digit");
        else if(n>=-999 && n<=999)
        System.out.println("Three Digit");
        else
        System.out.println("More than 3 digit");
    }
}
