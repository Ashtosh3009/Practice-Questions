/*
 Write a program to print the following pattern : 
        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
*/
public class Pattern45 {
    public static void main (String args[])
    {
        int i,j,l,k,m=4;
        for(i=1 ; i<=5 ; i++)
        {
            for(j=1 ; j<=m ; j++)
            {
                System.out.print("  ");
            }
            m--;
            for(j=i ; j>=1 ; j--)
            {
                System.out.print(j+" ");
            }
            for(k=2 ; k<(i+1) ; k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
