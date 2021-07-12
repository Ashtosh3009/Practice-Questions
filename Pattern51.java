/*
Write a program to print the following pattern : 
1 1 1 1 1
1 2 2 2 2
1 2 3 3 3
1 2 3 4 4
1 2 3 4 5
*/
public class Pattern51 {
    public static void main (String args[])
    {
        int i,j,k;
        for(i=1 ; i<=5 ; i++)
        {
            for(j=1 ; j<=i ; j++)
            {
                System.out.print(j+" ");
            }
            for(k=1 ; k<=(5-i) ; k++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
