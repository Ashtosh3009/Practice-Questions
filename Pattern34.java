/*
 Write a program to print the following pattern : 
        5
      5 4
    5 4 3
  5 4 3 2
5 4 3 2 1
*/
public class Pattern34 {
    public static void main (String args[])
    {
        int i,j,l,m=5;
        for(i=5;i>=1;i--)
        {
            for(l=1; l<=(m-1) ;l++)
            {
                System.out.print("  ");
            }
            for(j=5 ; j>=i ; j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
            m--;
        }
    }
}
