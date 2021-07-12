/*
Write a program to print following pattern : 
1
2 2 2
3 3 3 3 3
4 4 4 4 4 4 4
5 5 5 5 5 5 5 5 5
*/
public class Pattern19 {
    public static void main (String args[])
    {
        int i,j,k;
        for(i=1,k=1 ; i<=9 ; i+=2,k++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
