/*
Write a program to check the following functions :
int isPerfect (int n) : Check whether it is Perfect Number or not.
char isArm (int n) : Check whether it is Armstrong Number or not.
Also check the them from numbers 1 to 10,000 , using main() function.
*/
class PerfectArm 
{
    int sum, i, res, t, d;
    int isPerfect (int n)
    {
        sum = 0; 
        for (i=1 ; i<n ; i++)
        {
            if(n % i == 0)
            sum += i;
        }
        if(sum == n)
        return (1);
        else
        return (0);
    }    
    char isArm(int n)
    {
        res = 0;
        t = n;
        while(t > 0)
        {
            d = t % 10;
            res = res + d*d*d;
            t /= 10;
        }
        if(n == res)
        return 't';
        else
        return 'f';
    }
    public static void main (String args[])
    {
        int n, Perfect;
        char Armstrong;
        PerfectArm ob = new PerfectArm();
        System.out.println("Perfect Numbers : ");
        for (n=1 ; n<=10000 ; n++)
        {
            Perfect = ob.isPerfect(n);
            if(Perfect == 1)
            System.out.println(n);
        }
        System.out.println("Armstrong Number : ");
        for (n=1 ; n<=10000 ; n++)
        {
            Armstrong = ob.isArm(n);
            if (Armstrong == 't')
            System.out.println(n);
        }
    }
}
