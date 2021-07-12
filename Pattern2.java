// W.A.P. to print the following pattern
// * @ * @ *
// * @ * @ *
// * @ * @ *
public class Pattern2 {
    public static void main (String args[])
    {
        int i,j;
        for(i=1;i<=3;i++)
        {
            for(j=1;j<=5;j++)
            {
                if(j%2==0)
                System.out.print("@ ");
                else
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
