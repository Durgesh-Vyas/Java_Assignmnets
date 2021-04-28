package Pro5a;

class Rectangle extends Shapes
{
    double length, width;

    Rectangle()
    {
        this.length = 0;
        this.width = 0;
    }

    Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    Rectangle(double length, double width , String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
        this.length = length;
        this.width = width;
    }

    double getLength()
    {
        return length;
    }

    double getWidth()
    {
        return width;
    }

    void setLength(double len)
    {
        this.length = len;
    }

    void setWidth(double wid)
    {
        this.width = wid;
    }

    double getArea()
    {
        return length * width;
    }

    double getPerimeter()
    {
        return 2 * (length + width);
    }
}