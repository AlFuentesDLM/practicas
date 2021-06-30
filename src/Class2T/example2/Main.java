package Class2T.example2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(10,20);
        Rectangle rectangle = new Rectangle(10,20);
        Utils.figures.add(circle);
        Utils.figures.add(triangle);
        Utils.figures.add(rectangle);
        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
        System.out.println("Average area between 3 elements: "+Utils.averageArea());
    }
}
