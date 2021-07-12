/*
 Write a program to print the following pattern : 
        1
      2 1
    3 2 1
  4 3 2 1
5 4 3 2 1
*/
public class Pattern33 {
    public static void main (String args[])
    {
        int i,j,l;
        for(i=1;i<=5;i++)
        {
            for(l=1;l<=(5-i);l++)
            {
                System.out.print("  ");
            }
            for(j=i;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
