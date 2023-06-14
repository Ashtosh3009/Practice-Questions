//W.A.P. to Input a character and print it.
import java.util.*;
public class Printing {
    public static void main(String args[])
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        ch=sc.next().charAt(0);
        System.out.println("New Character : "+ch);
    }
}
