
import java.util.Random;


public class ShapeGenerator {
    
    private int [] A = {1,2,3,4,8,12,16};
    private int N;
    private int generated;

    public ShapeGenerator(int N) {
        this.N = N;
        this.generated = 0;
    }
    
    public boolean hasNextShape(){
        if (generated<N){
            return true;
        }else{
            return false;
        }
    }
    
    public Shape nextShape(){
        
        if(!hasNextShape()){
            return null;
        }
        
        Random random = new Random();
        int shapeType = random.nextInt(4);
        
        if(shapeType == 0){
            int area = A[random.nextInt(7)];
            Shape s = new Circle(area);
            generated++;
            return s;
        }else if(shapeType == 1){
            int area = A[random.nextInt(7)];
            Shape s = new Pentagon(area);
            generated++;
            return s;
        }else if(shapeType == 2){
            int area = A[random.nextInt(7)];
            Shape s = new Triangle(area);
            generated++;
            return s;
        }else if(shapeType == 3){
            int area = A[random.nextInt(7)];
            Shape s = new Square(area);
            generated++;
            return s;
        }else{
            return null;
        }  
    }
    
}
