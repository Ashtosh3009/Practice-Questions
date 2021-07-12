/*
 Write a program to print the following pattern : 
        5
      4 5
    3 4 5
  2 3 4 5
1 2 3 4 5
*/
public class Pattern35 {
    public static void main (String args[])
    {
        int i,j,l,m=5;
        for(i=5;i>=1;i--)
        {
            for(l=1;l<=(m-1);l++)
            {
                System.out.print("  ");
            }
            m--;
            for(j=i ; j<=5 ; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
