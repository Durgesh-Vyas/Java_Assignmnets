package Pro5a;

class Pro5a
{
    public static void main(String[] args)
    {
        Circle circle = new Circle (5, "Blue", true);
        Rectangle rectangle = new Rectangle(4, 6, "Purple", true);
        Square square = new Square (10, "White", true);

        square.setWidth(square.getSide());
        square.setLength(square.getSide());

        double arCircle = circle.getArea();
        double arRectangle = rectangle.getArea();
        double arSquare = square.getArea();

        double periCircle = circle.getPerimeter();
        double periRectangle = rectangle.getPerimeter();
        double periSquare = square.getPerimeter();

        System.out.print(circle.getColor());
        System.out.print("\nCircle is filled : "+circle.isFilled());
        System.out.print("\nArea of Circle : "+arCircle);
        System.out.print("\nPerimeter of Circle : "+periCircle+"\n\n");

        System.out.print(rectangle.getColor());
        System.out.print("\nRectangle is filled : "+rectangle.isFilled());
        System.out.print("\nArea of Rectangle : "+arRectangle);
        System.out.print("\nPerimeter of Rectangle: "+periRectangle+"\n\n");

        System.out.print(square.getColor());
        System.out.print("\nSquare is filled : "+square.isFilled());
        System.out.print("\nArea of Square : "+arSquare);
        System.out.print("\nPerimeter of Square : "+periSquare+"\n\n");
    }
}