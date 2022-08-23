package structural.bridge;

public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle(new BlueColour());
        triangle.applyColour();

        Shape circle = new Circle(new GreenColour());
        circle.applyColour();

        Shape pentagon = new Pentagon(new RedColour());
        pentagon.applyColour();
    }
}
