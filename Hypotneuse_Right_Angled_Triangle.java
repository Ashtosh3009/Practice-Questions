//W.A.P. to print the hypotneuse of right-angled triangle whose base=7 and height is 5.
public class Hypotneuse_Right_Angled_Triangle {
    public static void main(String args[])
    {
        int b=7,h=5,hyp;
        double hy;
        hy=Math.sqrt(b*b+h*h);
        hyp=(int)hy;
        System.out.println("Hypotneuse = "+hy);
    }    
}
