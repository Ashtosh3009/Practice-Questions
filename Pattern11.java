/*
W.A.P. to print the following pattern :
1 2 3 4 5
2 3 4 5 6
3 4 5 6 7
4 5 6 7 8
5 6 7 8 9
*/
public class Pattern11 {
    public static void main (String args[])
    {
        int i,j,m=0;
        for(i=1 ; i<=5 ;i++)
        {
            for(j=1;j<=5;j++)
            {
                System.out.print((j+m)+" ");
            }
            m++;
            System.out.println();
        }
    }
}
