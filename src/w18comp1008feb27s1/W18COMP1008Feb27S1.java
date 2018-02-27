package w18comp1008feb27s1;

import java.util.ArrayList;

/**
 *
 * @author JWright
 */
public class W18COMP1008Feb27S1
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle(10,20);
        Circle circle = new Circle(15);
        
        ArrayList<TwoDimensionalShape> shapes = new ArrayList<>();
        shapes.add(rectangle);
        shapes.add(circle);
        
        for (TwoDimensionalShape shape:shapes)
        {
            System.out.printf("Class: %s   Area: %.1f cm squared%n",
                    shape.getClass(), shape.getArea());
        }
    }
    
}
