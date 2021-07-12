// Write a program to create a function void factorial() to input a number and display its factorial
// also write main() method
import java.util.*;
public class Factorials {
    int n,i,f;
    void get()
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
    }
    void factorial()
    {
        f = 1;
        for( i=1 ; i<=n ; i++ )
        {
            f = f * i;
        }
    }
    void display()
    {
        System.out.println("Factorial = "+f);
    }
    public static void main (String args[])
    {
        Factorials ob = new Factorials ();
        ob.get();
        ob.factorial();
        ob.display();
    }
}
