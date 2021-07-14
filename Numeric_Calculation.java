/*
Write a program to perform following functions and also call them all, using main() method.
void numcalc (int n, char ch) - computes the square of n if ch is S otherwise computes its cube.
void numcalc (int a, int b ,char ch) - computes the product when ch is P otherwise calculate the sum.
void numcalc (char a , char b) - test the equality of two characters.
*/
import java.util.*;
public class Numeric_Calculation 
{
    int result;
    void numcalc (int n , char ch)
    {
        switch(ch)
        {
            case 's':
            case 'S':
            result = n * n;
            break;
            default:
            result = n*n*n;
            break;
        }
        System.out.println("Result value = "+result);
    }
    void numcalc (int a , int b , char ch)
    {
        switch (ch)
        {
            case 'P':
            case 'p':   result = a * b;
                        break;
            default :   result = a + b;
        }
        System.out.println("Resulted value = "+result);
    }
    void numcalc (char a , char b)
    {
        System.out.println("Characters are " + (a==b ? "Equal" : "Not Equal"));
    }
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        Numeric_Calculation ob = new Numeric_Calculation();
        int a, b;
        char ch, ch1;
        System.out.print("\nEnter a numbers and a character : ");
        a = sc.nextInt();
        ch = sc.next().charAt(0);
        ob.numcalc(a,ch);
        System.out.print("\nEnter two numbers and a character : ");
        a = sc.nextInt();
        b = sc.nextInt();
        ch = sc.next().charAt(0);
        ob.numcalc(a,b,ch);
        System.out.print("\nEnter two characters : ");
        ch = sc.next().charAt(0);
        ch1 = sc.next().charAt(0);
        ob.numcalc(ch,ch1);
        sc.close();
    }
}
