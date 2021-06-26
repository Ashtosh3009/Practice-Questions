/**
 * Write a Program to print area and perimeter of a rectangle whose length is 10 and width is 5.
 */
public class Area_and_Perimeter_of_Rectangle {
    public static void main(String args[])
    {
        int l=10, b=5;
        double area, perimeter;
        area=l*b;
        perimeter=2*(l+b);
        System.out.println("\nArea = "+area+"\nPerimeter = "+perimeter);
    }
}
