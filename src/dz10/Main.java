package dz10;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3);
        shapes[1] = new Triangle(4, 5);
        shapes[2] = new Square(6);

        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }

        System.out.println("Площадь фигур: " + totalArea);
    }
}
