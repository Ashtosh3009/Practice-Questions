/*
Write a program to print the following pattern : 
5 5 5 5 5
5 4 4 4 4
5 4 3 3 3
5 4 3 2 2
5 4 3 2 1
*/
public class Pattern52 {
    public static void main (String args[])
    {
        int i,j,k;
        for(i=5 ; i>=1 ; i--)
        {
            for(j=5 ; j>=i ; j--)
            {
                System.out.print(j+" ");
            }
            for(k=1 ; k<=(i-1) ; k++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
