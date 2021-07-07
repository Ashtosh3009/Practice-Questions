// W.A.P. to print Palindrome Number from 1 to 1000.
public class Palindrome_Number {
    public static void main (String args[])
    {
        int n,t,sum,d;
        for(n=1;n<=1000;n++)
        {
            t=n;
            sum=0;
            while(t>0)
            {
                d=t%10;
                sum=sum*10+d;
                t=t/10;
            }
            if(sum==n)
            System.out.println(n);
        }
    }
}
