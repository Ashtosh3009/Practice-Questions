//W.A.P. to print roots of quadratic equation having co-efficient 2,3 and 4 respectively.
public class Quadratic_Equation {
    public static void main(String args[])
    {
        int a=2,b=3,c=4;
        double r1,r2;
        r1=(-1*b+Math.sqrt(Math.abs(b*b-4*a*c)))/(2.0*a);
        r2=(-1*b-Math.sqrt(Math.abs(b*b-4*a*c)))/(2.0*a);
        System.out.println("Roots of Quadratic Equation : "+r1+"\t"+r2);
    }    
}
