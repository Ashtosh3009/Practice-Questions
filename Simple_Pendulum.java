//W.A.P. to print the time period of simple pendulum whose length=10. (Take g=9.8)
public class Simple_Pendulum
{
    public static void main(String args[])
    {
        int l=10;
        double g=9.8,t;
        t=2*355/113.0*Math.sqrt(l/g);
        System.out.println("Time Period of Simple Pendulum = "+t);
    }
}