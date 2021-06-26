/**
 * W.A.P. to print the net salary of an employee whose basic is 7200.
 * TA (Travelling Allowance) = 30% of BASIC
 * DA = 25% of BASIC
 * PF = 12.5% of BASIC
 * NET= BASIC+TA+DA-PF 
 */
public class Salary_Of_An_Employee {
    public static void main(String args[])
    {
        int b=7200;
        double t,d,p,n;
        t=0.3*b;
        d=0.25*b;
        p=0.125*b;
        n=b+t+d-p;
        System.out.println("\nNet Salary Of An Employee = "+n);
    }
}
