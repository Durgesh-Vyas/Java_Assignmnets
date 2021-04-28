package Pro5a;

abstract class Shapes
{
    String color;
    boolean filled;

    Shapes()
    {
        color="";
        filled=true;
    }

    Shapes(String color,boolean filled)
    {
        this.color=color;
        this.filled=filled;
    }

    String getColor()
    {
        return color;
    }

    void setcolor(String color)
    {
        this.color=color;
    }

    boolean isFilled()
    {
        return filled;
    }

    void setfilled(boolean filled)
    {
        this.filled=filled;
    }

    abstract double getArea();
    abstract double getPerimeter();
    @Override
    public String toString()
    {
        return color;
    }
}