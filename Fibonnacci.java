/**W.A.P. to print first 10 terms of fibonacci series :
 * 0 1 1 2 3 5 8 ...... 34 
 */
public class Fibonnacci {
    public static void main(String args[])
    {
        int f=-1,i,s=1,t;
        for(i=1;i<=10;i++)
        {
            t=f+s;
            System.out.print(t+" ");
            f=s;
            s=t;
        }
        System.out.println();
    }
}
