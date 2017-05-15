package shapes;

public class Rectangle implements Shape {

    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getSquare() {
        return a * b;
    }
}
