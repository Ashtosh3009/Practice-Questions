// Write a program to create a function void factors() to input a number and display all its factors
// also write main() method
import java.util.*;
public class Factrors {
    int n,i;
    public static void main (String args[])
    {
        Factrors ob = new Factrors();
        ob.factors();
        ob.display();
    }
    void factors()
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();
    }
    void display()
    {
        System.out.print("Factors are : ");
        for(i=1; i<=n ; i++)
        {
            if(n%i==0)
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
