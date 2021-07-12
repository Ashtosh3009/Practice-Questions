/**
 Write a program to print the following pattern : 
        *
      * *
    * * *
  * * * *
* * * * *
 */
public class Pattern29 {
    public static void main (String args[])
    {
        int i,j,l;
        for(i=1;i<=5;i++)
        {
            for(l=1 ; l<=(5-i) ; l++)
            {
                System.out.print("  ");
            }
            for(j=1 ; j<=i ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
