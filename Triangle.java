
public class Triangle extends Shape{
    
    public Triangle(double emvado) {
        super("Triangle", emvado);
    }


    public double computeArea() {
        return (1.0/2.0)*getOutArea();
    }
    
    
    
}
