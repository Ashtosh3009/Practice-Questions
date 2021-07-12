/*
 Write a program to print the following pattern : 
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
*/
public class Pattern40 {
    public static void main (String args[])
    {
        int i,j,l,m=4,k;
        for(i=1 ; i<=5 ; i++)
        {
            for(l=1 ; l<=m ; l++)
            {
                System.out.print("  ");
            }
            m--;
            for(j=1 ; j<=i ; j++)
            {
                System.out.print("* ");
            }
            for(k=(i-1) ; k>0 ; k--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
