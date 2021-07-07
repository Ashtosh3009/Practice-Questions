import java.util.*;
class NestedSeries1
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int i,j,f=1,sum=0;
        for(i=1;i<=n;i++)
        {
            f=1;
            for(j=1;j<=i;j++)
            {
                f=f*j;
            }
            sum=sum+f;
        }
        System.out.println("Sum = "+sum);
        sc.close();
    }
}