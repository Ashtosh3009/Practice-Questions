//W.A.P. to input an alphabet and print its respective position as in English Vocabulary
import java.util.*;
public class EnglishVocabulary {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character : ");a
        char ch=sc.next().charAt(0);
        int n;
        if(ch>='A'&&ch<='Z')
        n=(int)(ch-64);
        else if(ch>='a'&&ch<='z')
        n=(int)(ch-96);
        else
        {
            n=-1;
            System.out.println("Wrong Input");
        }
        System.out.println("Respective Position : "+n);
    }
}
