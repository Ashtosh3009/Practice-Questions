//W.A.P. to input an alphabet and print it in opposite case.
import java.util.*;
public class opposite_case {
    public static void main(String args[])
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character : ");
        ch=sc.next().charAt(0);
        if(Character.isLowerCase(ch))
        ch=Character.toUpperCase(ch);
        else if(Character.isUpperCase(ch))
        ch=Character.toLowerCase(ch);
        System.out.println("Opposite Case : "+ch);
    }
}
