package structural.bridge;

public class Circle extends Shape{

    public Circle(Colour col) {
        super(col);
    }

    @Override
    public void applyColour() {
        System.out.print("Circle colour applied: ");
        colour.applyColour();
    }
}
