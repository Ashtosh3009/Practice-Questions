// W.A.P. to print Prime Numbers from 1 to 100.
public class Prime_Numbers {
    public static void main (String args[])
    {
        int n,i,c=0;
        for(n=1;n<=100;n++)
        {
            c=0;
            for(i=1;i<=n;i++)
            {
                if(n%i==0)
                {
                    c++;
                }
            }
            if(c==2)
            System.out.println(n);
        }
    }
}
