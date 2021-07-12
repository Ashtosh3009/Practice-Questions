/*
 Write a program to print the following pattern : 
        1
      1 2
    1 2 3
  1 2 3 4
1 2 3 4 5
*/
public class Pattern32 {
    public static void main(String args[])
    {
        int i,j,l;
        for( i=1 ; i<=5 ;i++)
        {
            for( l=1 ; l<=(5-i) ; l++)
            {
                System.out.print("  ");
            }
            for( j=1 ; j<=i ; j++ )
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
