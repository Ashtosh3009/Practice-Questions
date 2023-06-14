/*
Write a program to perform following functions and also call them all, using main() method.
void compare (int a, int b) - prints the greater of them.
void compare (char a, char b) - prints the character with high numeric value (ASCII Code)
*/
import java.util.*;
public class comparison {
    int max;
    void compare (int a, int b)
    {
        max = a > b ? a : b ;
        System.out.println("Greatest number : "+max);
    }    
    void compare (char a, char b)
    {
        char ch = (int)a > (int)b ? a : b;
        System.out.println("Greatest Numeric Character : "+ch);
    }
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        comparison ob = new comparison();
        System.out.print("\nEnter two numbers : ");
        int a , b;
        char c , d;
        a = sc.nextInt();
        b = sc.nextInt();
        ob.compare(a,b);
        System.out.print("\nEnter two characters : ");
        c = sc.next().charAt(0);
        d = sc.next().charAt(0);
        ob.compare(c,d);
        sc.close();
    }
}