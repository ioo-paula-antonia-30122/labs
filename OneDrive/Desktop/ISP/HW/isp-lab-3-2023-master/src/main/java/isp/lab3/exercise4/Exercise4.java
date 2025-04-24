package isp.lab3.exercise4;

public class Exercise4 {
    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(5, 6, 7);
        MyPoint point2 = new MyPoint(8, 9, 10);

        System.out.println("Coordinates: " + point1.toString());
        System.out.println("Distance between point1 and (8,9,10): " + point1.distance(8, 9, 10) + "\n");

        System.out.println("Coordinates: " + point2.toString());
        System.out.println("Distance between point1 and point2: " + point1.distance(point2) + "\n");

    }
}
