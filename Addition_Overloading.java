/*
Write a program to perform Add() functions overloading and also call them all, using main() method.
1) addition of two integer numbers
2) addition of three intger numbers
3) addition of two double numbers
4) addition of two Strings
5) addition of first one intger number and second one double number
6) addition of first one double number and second one integer number
*/
import java.util.*;
public class Addition_Overloading 
{
    void Add(int a, int b)
    {
        int sum = a + b;
        System.out.println("Sum 1 = "+sum);
    }    
    void Add(int a, int b, int c)
    {
        int sum = a + b + c;
        System.out.println("Sum 2 = "+sum);
    }    
    void Add(double a, double b)
    {
        double sum = a + b;
        System.out.println("Sum 3 = "+sum);
    }    
    void Add(String a, String b)
    {
        String sum = a +""+ b;
        System.out.println("Sum 4 = "+sum);
    }    
    void Add(int a, double b)
    {
        double sum = (double)a + b;
        System.out.println("Sum 5 = "+sum);
    }    
    void Add(double a, int b)
    {
        double sum = a + (double)b;
        System.out.println("Sum 6 = "+sum);
    }
    public static void main (String args[])
    {
        int n1, n2, n3;
        double d1, d2;
        String s1, s2;
        Scanner sc = new Scanner (System.in);
        Addition_Overloading ob = new Addition_Overloading();
        System.out.print("\nSeries 1:- \nEnter two integer numbers : ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        ob.Add(n1,n2);
        System.out.print("\nSeries 2:- \nEnter three integer numbers : ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();
        ob.Add(n1,n2,n3);
        System.out.print("\nSeries 3:- \nEnter two double numbers : ");
        d1 = sc.nextDouble();
        d2 = sc.nextDouble();
        ob.Add(d1,d2);
        System.out.print("\nSeries 4:- \nEnter two Strings : ");
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        ob.Add(s1,s2);
        System.out.print("\nSeries 5:- \nEnter an integer and a double number : ");
        n1 = sc.nextInt();
        d1 = sc.nextDouble();
        ob.Add(n1,d1);
        System.out.print("\nSeries 6:- \nEnter a double and and integer number : ");
        d2 = sc.nextDouble();
        n2 = sc.nextInt();
        ob.Add(d2,n2);
        sc.close();
    }    
}