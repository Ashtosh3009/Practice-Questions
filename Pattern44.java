/*
 Write a program to print the following pattern : 
        *
      *   *
    *       *
  *           *
* * * * * * * * *
*/
public class Pattern44 {
    public static void main (String args[])
    {
        int i,j,l,m=4;
        for(i=1 ; i<=9 ; i+=2)
        {
            for(l=1;l<=m;l++)
            {
                System.out.print("  ");
            }
            m--;
            for(j=1 ; j<=i ; j++)
            {
                if(j==1 || i==1 || i==j || i==9)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }        
    }
}
