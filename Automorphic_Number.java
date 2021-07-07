// W.A.P. to print Automorphic Numbers from 1 to 10,000.
public class Automorphic_Number {
    public static void main (String args[])
    {
        int n,t,c,s,m;
        for(n=1;n<=10000;n++)
        {
            t=n;
            c=0;
            s=t*t;
            while(t>0)
            {
                c++;
                t/=10;
            }
            m = s % (int)Math.pow(10,c);
            if(m==n)
            System.out.println(n);
        }
    }
}