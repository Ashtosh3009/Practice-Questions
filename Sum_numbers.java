// Write a program to input two numbers and print its sum using main function
import java.util.*;
public class Sum_numbers {
    int Sum(int a, int b)
    {
        int sum = a + b;
        return sum;
    }
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter two numbers : ");
        int a,b,sum;
        a = sc.nextInt();
        b = sc.nextInt();
        Sum_numbers ob = new Sum_numbers();
        sum = ob.Sum(a,b);
        System.out.println("Sum = "+sum);
        sc.close();
    }
}
