/*
 Write a program to print the following pattern : 
        5
      5 4 5
    5 4 3 4 5
  5 4 3 2 3 4 5
5 4 3 2 1 2 3 4 5
*/
public class Pattern46 {
    public static void main (String args[])
    {
        int i,j,l,m=4,k;
        for(i=5 ; i>=1; i--)
        {
            for(l=1;l<=m;l++)
            {
                System.out.print("  ");
            }
            m--;
            for(j=5 ; j>=i ; j--)
            {
                System.out.print(j+" ");
            }
            for(k=i ; k<5 ; k++)
            {
                System.out.print((k+1)+" ");
            }
            System.out.println();
        }
    }
}
