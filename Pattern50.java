/*
Write a program to print the following pattern : 
5 4 3 2 1 2 3 4 5
  4 3 2 1 2 3 4
    3 2 1 2 3
      2 1 2
        1
*/
public class Pattern50 {
    public static void main (String args[])
    {
        int i,j,l,k,m=0;
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
            for(k=2 ; k<=i ; k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
