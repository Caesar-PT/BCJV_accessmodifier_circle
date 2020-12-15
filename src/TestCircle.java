public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getColor());
        Circle circle2 = new Circle(5.0);
        System.out.println(circle2.getRadius());
        System.out.println(circle2.getArea());
    }
}
