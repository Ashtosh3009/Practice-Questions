// Write a program to create a function void fibo() to input a number and display it's fibonacci series.
// Also write main() method.
import java.util.*;
class FIBO {
    int f,s,t,i;
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        FIBO ob = new FIBO ();
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        ob.fibo(n);
    }
    void fibo(int n)
    {
        System.out.print("Fibonacci series : ");
        f = -1;
        s = 1;
        for(i=1 ; i<=n ; i++)
        {
            t = f + s;
            System.out.print(t+" ");
            f = s;
            s = t;
        }
        System.out.println();
    }
}