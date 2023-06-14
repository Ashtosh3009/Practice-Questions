// Write a program to create a function void isPrime() to input a number and display whether 
// number is Prime Number or not. Also write main() method.
import java.util.*;
public class Prime_Number {
    int n,i,c=0;   
    public static void main (String args[])
   {
       Prime_Number ob = new Prime_Number ();
       ob.input();
       ob.isPrime();
       ob.display();
   } 
   void input()
   {
       Scanner sc = new Scanner (System.in);
       System.out.print("Enter a number : ");
       n = sc.nextInt();
   }
   void isPrime()
   {
       for(i=1; i<=n ; i++)
       {
           if(n%i==0)
           c++;
       }       
   }
   void display()
   {
       if(c==2)
       System.out.println("It's a Prime Number");
       else
       System.out.println("It's not a Prime Number");
   }
}
