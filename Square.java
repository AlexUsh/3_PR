public class Square extends Rectangle {

    public Square() {
        color = "Green";
        filled = false;
        width = 0;
        length = 0;
    }

    public Square(double side) {
        color = "Green";
        filled = false;
        width = side;
        length = side;
    }

    public Square(double side, String color, boolean filled) {
        width = side;
        length = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        width = side;
        length = side;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Square: width = " + width + ", length = " + length;
    }
}
