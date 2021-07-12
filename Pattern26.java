/**
 Write a program to print the following pattern : 
5
4 5
3 4 5
2 3 4 5
1 2 3 4 5
 */
public class Pattern26 {
    public static void main (String args[])
    {
        int i,j;
        for(i=5 ; i>=1 ; i--)
        {
            for(j=i ; j<=5 ; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
