/*
Write a program to print the following pattern : 
1
3 3
5 5 5
7 7 7 7
9 9 9 9 9
*/
public class Pattern18 {
    public static void main (String args[])
    {
        int i,j,k;
        for(i=1,k=1;i<=9;i+=2,k++)
        {
            for(j=1;j<=k;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
