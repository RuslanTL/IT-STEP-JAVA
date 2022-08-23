package structural.bridge;

public class Pentagon extends Shape{

    public Pentagon(Colour col) {
        super(col);
    }

    @Override
    public void applyColour() {
        System.out.print("Pentagon colour applied: ");
        colour.applyColour();
    }
}
