/*
 Write a program to print the following pattern : 
1 2 3 4 5
  1 2 3 4
    1 2 3
      1 2
        1
*/
public class Pattern37 {
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
            for(j=1 ; j<=i ; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
