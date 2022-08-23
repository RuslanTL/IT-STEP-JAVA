package structural.bridge;

abstract public class Shape {
    protected Colour colour;
    public Shape(Colour col){
        this.colour = col;
    }
    abstract public void applyColour();
}
