package shapes;


import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(10);
        Rectangle rectangle1 = new Rectangle(2,7);
        Rectangle rectangle2 = new Rectangle(88,1);

        Shape[] shapes = {circle1, rectangle2, circle2, rectangle1};

        long c = Arrays.stream(shapes).filter(s -> s instanceof Circle).count();
        System.out.println("Количество кружков = " + c);

        for(Shape shape: shapes){

            if (shape instanceof Circle){
                Circle circle = (Circle) shape;
                System.out.println("Кружок: S = " + shape.getSquare() + " r = " + circle.getRadius());
            } else {
                Rectangle rectangle = (Rectangle) shape;
                System.out.println("Прямоугольничек: S = " + shape.getSquare());
            }
        }


        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        };


    }

}
