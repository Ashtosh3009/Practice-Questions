/**
 * W.A.P. to input a gender. If the gender is M then print "Hello Sir". 
 * If gender is F then print "Hello Mam", otherwise print "Sorry cannot predict it".
 */
import java.util.*;
public class Gender{
    public static void main(String args[])
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a charcter : ");
        ch=sc.next().charAt(0);
        if(ch=='f' || ch=='F')
        System.out.println("Hello Mam");
        else if(ch=='M' || ch=='m')
        System.out.println("Hello Sir");
        else
        System.out.println("Sorry cannot predict it");
    }
}