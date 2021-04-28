package Pro5a;

class Circle extends Shapes
{
    double radius;


    Circle()
    {
        this.radius = 0;
    }

    Circle(double radius)
    {
        this.radius = radius;
    }

    Circle(double radius, String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
        this.radius = radius;
    }

    double getRadius()
    {
        return radius;
    }

    void setRadius(double r)
    {
        this.radius = r;
    }

    double getArea()
    {
        return Math.PI*radius*radius;
    }

    double getPerimeter()
    {
        return 2*Math.PI*radius;
    }
}