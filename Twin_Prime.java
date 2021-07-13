public class Twin_Prime
{
    boolean isPrime(int n)
    {
        int i,c=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==2)
        return true;
        else
        return false;
    }
    public static void main (String args[])
    {
        Twin_Prime ob = new Twin_Prime();
        int n;
        boolean n1,n2;
        for(n=1 ; n<=100 ; n++)
        {
            n1 = ob.isPrime(n);
            n2 = ob.isPrime(n+2);
            if ( n1 == true && n2 == true)
            {
                System.out.println(n+" "+(n+2));
            }
        }
    }
}