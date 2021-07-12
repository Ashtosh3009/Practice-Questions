/*
Write a program to print the following series:
1
2 3
4 5 6
7 8 9 10
*/
public class Pattern20 {
    public static void main(String args[])
    {
        int k=1,i,j;
        for(i=1;k<10;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}