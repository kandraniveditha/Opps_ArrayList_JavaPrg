package Java.partice.oops.solid;

public class Square extends Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int calculateArea() {
        return side * side;
    }
}