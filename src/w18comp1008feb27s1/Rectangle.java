package w18comp1008feb27s1;

/**
 *
 * @author JWright
 */
public class Rectangle extends TwoDimensionalShape
{
    private double height, width;

    public Rectangle(double height, double width)
    {
        setHeight(height);
        setWidth(width);
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        if (height > 0)
            this.height = height;
        else
            throw new IllegalArgumentException("height must be greater than 0");
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        if (width>0)
            this.width = width;
        else
            throw new IllegalArgumentException("width must be greater than 0");
    }

    @Override
    public double getArea()
    {
        return width*height;
    }
    
}
