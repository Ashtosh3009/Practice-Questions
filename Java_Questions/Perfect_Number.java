// W.A.P. to print Perfect number from 1 to 1000.
public class Perfect_Number {
    public static void main (String args[])
    {
        int n,i,sum=0;
        for(n=1;n<=1000;n++)
        {
            sum=0;
            for(i=1;i<n;i++)
            {
                if(n%i==0)
                {
                    sum = sum + i;
                }
            }
            if(sum==n)
            System.out.println(sum);
        }
    }
}
