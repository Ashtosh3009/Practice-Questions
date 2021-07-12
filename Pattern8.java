// W.A.P. to print the following pattern : 
// 1 2 3 4 5
// 1 2 3 4 5
// 1 2 3 4 5
public class Pattern8 {
    public static void main (String args[])
    {
        int i,j;
        for(i=1 ; i<=3 ; i++)
        {
            for(j=1 ; j<=5 ; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
