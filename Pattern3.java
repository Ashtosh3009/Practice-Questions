// W.A.P. to print the following pattern
// * * *
// @ @ @
// * * *
// @ @ @
// * * *
public class Pattern3 {
    public static void main (String args[])
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=3;j++)
            {
                if(i%2==0)
                System.out.print("@ ");
                else
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
