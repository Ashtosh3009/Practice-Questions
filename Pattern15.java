/*
W.A.P. to print the following pattern : 
*
* *
*   *
*     *
* * * * *

*/
public class Pattern15 {
    public static void main (String args[])
    {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                if(i==1 || j==1 || i==5 || i==j)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
