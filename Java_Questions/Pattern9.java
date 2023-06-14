// W.A.P. to print the following pattern :
// 1 1 1
// 2 2 2
// 3 3 3
// 4 4 4
// 5 5 5
public class Pattern9 {
    public static void main (String args[])
    {
        int i,j;
        for(i=1 ; i<=5; i++)
        {
            for(j=1 ; j<=3 ; j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
