package w18comp1008feb27s1;

/**
 *
 * @author JWright
 */
public class Circle extends TwoDimensionalShape
{
    private double radius;

    //Constructor
    public Circle(double radius)
    {
        setRadius(radius);
    }

    public double getRadius()
    {
        return radius;
    }

    /**
     * Validates the radius and sets it
     * @param radius 
     */
    public void setRadius(double radius)
    {
        if (radius > 0)
            this.radius = radius;
        else
            throw new IllegalArgumentException("radius must be greater than 0");
    }

    @Override
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
    
    
}
