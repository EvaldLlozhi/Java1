
public class Pentagon extends Shape{
    
    
    public Pentagon(double emvado) {
        super("Pentagon", emvado);
    }


    public double computeArea() {
        return (3.0/4.0)*getOutArea();
    }
}
