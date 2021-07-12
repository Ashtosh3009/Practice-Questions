/*
 Write a program to print the following pattern : 
        5
      4 5 4
    3 4 5 4 3
  2 3 4 5 4 3 2
1 2 3 4 5 4 3 2 1
*/
public class Pattern47 {
    public static void main (String args[])
    {
        int i,j,l,m=4,k;
        for(i=5 ; i>=1 ; i--)
        {
            for(l=1 ; l<=m ; l++)
            {
                System.out.print("  ");
            }
            m--;
            for(j=i ; j<=5 ; j++)
            {
                System.out.print(j+" ");
            }
            for(k=4 ; k>(i-1) ; k--)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }    
}