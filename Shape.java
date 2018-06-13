

public abstract class Shape {
    
    private String type;
    private double outArea;

    public Shape(String type, double outArea) {
        this.type = type;
        this.outArea = outArea;
    }

    public String getType() {
        return type;
    }

    public double getOutArea() {
        return outArea;
    }

    
    public boolean sameType(Shape other){
        if (other.type.equals(this.type)){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean sameArea(Shape other){
        if(other.computeArea() == computeArea()){
            return true;
        }else{
            return false;
        }
    }
    
    public String toString(){
        String str = "Type: "+type+" Out area: "+outArea+  ", Area: "+computeArea();
        return str;
    }
    
    public abstract double computeArea();
    
}
