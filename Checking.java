/**
 * W.A.P. to input a number and check
 * (a) even or odd
 * (b) positive or negative
 * (c) single digit or multiple digit
 */
import java.util.Scanner;
public class Checking {
    public static void main(String args[])
    {
        int n;
        System.out.println("Enter a number : ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        EvenOdd(n);
        PosNeg(n);
        SinMul(n);
    }
    public static void EvenOdd(int n)
    {
        if(n%2==0)
        System.out.println("It\'s an Even Number");
        else
        System.out.println("It\'s an Odd Number");
    }
    public static void PosNeg(int n)
    {
        if(n>=0)
        System.out.println("It\'s a Positive Number");
        else
        System.out.println("It's a Negative Number");
    }
    public static void SinMul(int n)
    {
        if(n>=-9 && n<=9)
        System.out.println("It\'s a Single Number");
        else
        System.out.println("It\'s a Multiple Number");
    }
}
