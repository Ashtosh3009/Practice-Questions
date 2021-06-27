//W.A.P. to input a character and check whether it is alphabet, digit or special character
import java.util.*;
public class aplhadigi {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch=sc.next().charAt(0);
        if((ch>='A'&& ch<='Z')||(ch>='a'&& ch<='z'))
        System.out.println("Alphabet");
        else if(ch>='0' && ch<='9')
        System.out.println("Digit");
        else if(ch!=' ')
        System.out.println("Special Character");
    }
}
