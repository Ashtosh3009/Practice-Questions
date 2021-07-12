/*
 Write a program to print the following pattern : 
        *
      @ @ @
    * * * * *
  @ @ @ @ @ @ @
* * * * * * * * *
*/
public class Pattern42 {
    public static void main (String args[])
    {
        int i,j,l,m=4,k;
        for(i=1 , k=1 ; i<=9 ; i+=2 , k++)
        {
            for(l=1 ; l<=m ; l++)
            {
                System.out.print("  ");
            }
            m--;
            for(j=1 ; j<=i ; j++)
            {
                if(k%2==0)
                System.out.print("@ ");
                else
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
