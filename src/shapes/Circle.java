package shapes;


public class Circle implements Shape{

    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * Math.pow(radius, 2);
    }

    public int getRadius() {
        return radius;
    }
}
