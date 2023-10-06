package trenning.abstraction;

public class AbstractExample {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle("White", 8, 5);
        shapes[1] = new Circle("Red", 5);

        for (Shape shape:shapes) {
            System.out.println(shape.getArea() + " " + shape.getColor());

        }

    }
}
