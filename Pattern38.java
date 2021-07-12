/*
 Write a program to print the following pattern : 
5 4 3 2 1
  4 3 2 1
    3 2 1
      2 1
        1
*/
public class Pattern38 {
    public static void main (String args[])
    {
        int i,j,l,m=0;
        for(i=5 ; i>=1 ; i--)
        {
            for(l=1 ; l<=m ; l++)
            {
                System.out.print("  ");
            }
            m++;
            for(j=i ; j>=1 ; j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
