/*
Write a program to perform following functions and also call them all, using main() method.
void polygon(int n, char ch) - draws a square of size n filled with ch.
Example: ( "#", 5)
# # # # #
# # # # #
# # # # #
# # # # #
# # # # #
void polygon(int x , int y) - draws a filled rectangle with "@".
void polygon() - 
*
* *
* * *
* * * *
* * * * *
*/
import java.util.*;
public class Pattern_Overloading 
{
    int i,j;
    void polygon (int n , char ch)
    {
        for(i=1 ; i<=n ; i++)
        {
            for(j=1 ; j<=n ;j++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    void polygon(int x , int y)
    {
        for (i=1 ; i<=x ; i++)
        {
            for(j=1 ; j<=y ; j++)
            {
                System.out.print("@ ");
            }
            System.out.println();
        }
    }
    void polygon()
    {
        for(i=1 ; i<=5 ; i++)
        {
            for(j=1 ; j<=i ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main (String args[])
    {
        int n,x,y;
        char ch;
        Scanner sc = new Scanner (System.in);
        Pattern_Overloading ob = new Pattern_Overloading();
        System.out.print("\nEnter a character and a number for printing square : ");
        ch = sc.next().charAt(0);
        n = sc.nextInt();
        ob.polygon(n,ch);
        System.out.print("\nEnter two length and breadth of rectangle with character @ : ");
        x = sc.nextInt();
        y = sc.nextInt();
        ob.polygon(x,y);
        System.out.println("\n3rd Pattern : ");
        ob.polygon();
        sc.close();
    }
}
