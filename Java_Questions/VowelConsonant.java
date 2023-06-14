//W.A.P. to input a character and check whether it is vowel or consonant.
import java.util.*;
public class VowelConsonant {
    public static void main(String args[])
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character : ");
        ch=sc.next().charAt(0);
        ch=Character.toLowerCase(ch);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        System.out.println("Vowel");
        else
        System.out.println("Consonant");
    }
}
