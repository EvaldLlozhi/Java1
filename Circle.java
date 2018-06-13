

public class Circle extends Shape {
    
    public Circle(double emvado) {
        super("Circle", emvado);
    }

    public double computeArea() {
        return (Math.PI/4.0)*getOutArea();
    }
    
}
