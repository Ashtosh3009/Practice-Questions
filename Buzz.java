// W.A.P. to print Buzz numbers from 1 to 10,000
public class Buzz {
    public static void main (String args[])
    {
        int n;
        for(n=1;n<=10000;n++)
        {
            if(n%10==7 || n%7==0)
            System.out.println(n);
        }
    }
    
}