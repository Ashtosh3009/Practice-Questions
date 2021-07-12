/*
 Write a program to print the following pattern : 
5 4 3 2 1
  5 4 3 2
    5 4 3
      5 4
        5
*/
public class Pattern39 {
    public static void main (String args[])
    {
        int i,j,l,m=0;
        for(i=1;i<=5;i++)
        {
            for(l=1;l<=m;l++)
            {
                System.out.print("  ");
            }
            m++;
            for(j=5 ; j>=i ; j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
