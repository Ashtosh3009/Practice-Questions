//W.A.P. to print the Potential Energy of a ball whose mass=200 and dropped from height of 12 (take g=9.8).
public class Potential_Energy {
    public static void main(String args[])
    {
        int mass=200, height=12;
        double g=9.8, pe;
        pe=(mass*g*height)*100;
        System.out.println("Potential Energy of a ball = "+pe);
    }    
}
