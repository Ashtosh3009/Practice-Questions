//W.A.P. to print the area of scalene triangle having sides 3,5 and 7 respectively
public class Scalene_Triangle {
    public static void main(String args[])
    {
        int a=3,b=5,c=7;
        double ar,s;
        s=(a+b+c)/2.0;
        ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of Scalene Triangle = "+a);
    }
}
