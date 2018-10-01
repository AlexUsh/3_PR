public class Rectangle extends Shape {

    protected double width;
    protected double length;

    public Rectangle() {
        color = "Green";
        filled = false;
        width = 0;
        length = 0;
    }

    public Rectangle(double width, double length) {
        color = "Green";
        filled = false;
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double lentgh) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (width + length) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle: width = " + width + ", length = " + length + ", color = " + color;
    }
}