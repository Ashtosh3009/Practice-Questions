/*
Write a program to print the following pattern : 
1 2 3 4 5 4 3 2 1
  2 3 4 5 4 3 2
    3 4 5 4 3
      4 5 4
        5
*/
public class Pattern48 {
    public static void main (String args[])
    {
        int i,j,l,m=0,k;
        for(i=1 ; i<=5 ; i++)
        {
            for(l=1 ; l<=m ; l++)
            {
                System.out.print("  ");
            }
            m++;
            for(j=i ; j<=5 ; j++)
            {
                System.out.print(j+" ");
            }
            for(k=4 ; k>=i ; k--)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
