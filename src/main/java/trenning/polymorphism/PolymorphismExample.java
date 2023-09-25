package trenning.polymorphism;

public class PolymorphismExample {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes [0] = new Rectangle(2,3);
        shapes [1] = new Circle(1);

        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
        }
    }
}
