//W.A.P. to swap the values of A and B which are initially 8 and 12;
public class Swapping {
    public static void main(String args[])
    {
        int a=8,b=12;
        System.out.println("Before Swapping : \nA = "+a+"\nB = "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping : \nA = "+a+"\nB = "+b);
    } 
}
