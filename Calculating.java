/**
Write a program to create operations with following functions:
void Power (int a , int b)
void add (int a , int b)
void sub (int a , int b)
void product (int a , int b)
void div (int a , int b)
void mod (int a , int b)
Do it without respective operation sign
Also write main() method.
 */

import java.util.*;
public class Calculating {
    int i, sum, min;
    void Power(int a, int b)
    {
        sum=1;
        for(i=1 ; i<=b ; i++)
        {
            sum = sum * a;
        }
        System.out.println("Power = "+sum);
    }
    void add(int a , int b)
    {
        sum = a;
        for(i=1 ; i<=b ; i++)
        {
            sum++;
        }
        System.out.println("Addition = "+sum);
    }
    void sub (int a , int b)
    {
        sum = a;
        for(i=1 ; i<=b ; i++)
        {
            sum--;
        }
        System.out.println("Subtraction = "+sum);
    }
    void product(int a, int b)
    {
        sum = a;
        for(i=2 ; i<=b ; i++)
        {
            sum = sum + a;
        }
        System.out.println("Product = "+sum);
    }
    void div(int a , int b)
    {
        sum=0;
        while(a>=b)
        {
            a = a - b;
            sum++;
        }
        System.out.println("Division = "+sum);
    }
    void mod(int a , int b)
    {
        while(a>=b)
        {
            a = a - b;
        }
        System.out.println("Modulus = "+a);
    }
    public static void main (String args[])
    {
        int a,b;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter two numbers : ");
        a = sc.nextInt();
        b = sc.nextInt();
        Calculating ob = new Calculating();
        ob.Power(a,b);
        ob.add(a,b);
        ob.sub(a,b);
        ob.product(a,b);
        ob.div(a,b);
        ob.mod(a,b);
    }
}