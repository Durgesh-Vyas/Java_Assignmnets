package Pro5a;

class Square extends Rectangle
{
    double side;

    Square()
    {
        this.side = 0;
    }

    Square(double side)
    {
        this.side = side;
    }

    Square(double side, String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
        this.side = side;
    }

    double getSide()
    {
        return side;
    }

    void setWidth(double side)
    {
        this.width = side;
    }

    void setLength(double side)
    {
        this.length = side;
    }
}