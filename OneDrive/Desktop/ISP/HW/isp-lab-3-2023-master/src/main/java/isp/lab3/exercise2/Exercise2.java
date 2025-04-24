package isp.lab3.exercise2;

public class Exercise2 {
    public static void main(String[] arg) {
        Rectangle rectangle = new Rectangle(3, 4);

        System.out.println("Length: " + rectangle.getLength());

        System.out.println("Width: " + rectangle.getWidth());

        System.out.println("Color: " + rectangle.getColor());

        System.out.println("Perimeter: " + rectangle.getPerimeter());

        System.out.println("Area: " + rectangle.getArea());
    }
}