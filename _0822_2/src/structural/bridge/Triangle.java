package structural.bridge;

public class Triangle extends Shape{

    public Triangle(Colour col) {
        super(col);
    }

    @Override
    public void applyColour() {
        System.out.print("Triangle colour applied: ");
        colour.applyColour();
    }
}
