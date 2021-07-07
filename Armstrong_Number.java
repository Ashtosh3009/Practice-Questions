// W.A.P. to print Armstrong Numbers from 1 to 10,000.
public class Armstrong_Number {
    public static void main (String args[])
    {
        int n,i,t,sum=0,d;
        for(n=1;n<=10000;n++)
        {
            sum=0;
            t=n;
            while(t>0)
            {
                d=t%10;
                sum=sum + d*d*d;
                t/=10;
            }
            if(sum==n)
            System.out.println(n);
        }
    }
}
