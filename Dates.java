/**
Write a program to create with with following function:
void validDate(int d , int m , int y)
[Date present in that year]
Also write main() method.
 */
import java.util.*;
public class Dates {
    public static void main (String args[])
    {
        Dates ob = new Dates();
        Scanner sc = new Scanner (System.in);
        int d,m,y;
        System.out.print("Enter date, month and year : ");
        d = sc.nextInt();
        m = sc.nextInt();
        y = sc.nextInt();
        ob.validDate(d,m,y);
    }        
    void validDate(int d, int m ,int y)
    {
        switch(m)
        {
            case 2:
            if(y%400==0 || (y%100!=0 && y%4==0) && d<=29)
            {
                System.out.println("Valid Date");
            }
            else if(d<=28)
            {
                System.out.println("Valid Date");
            }
            else
            {
                System.out.println("Invalid Date");
            }
            break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            if(d>=1 && d<=31)
            System.out.println("Valid Date");
            break;

            case 4:
            case 6:
            case 9:
            case 11:
            if(d>=1 && d<=30)
            System.out.println("Valid Date");
            break;

            default:
            System.out.println("Invalid Date");
        }
    }
}