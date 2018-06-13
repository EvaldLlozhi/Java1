

public class ShapeGame {

    
    public static void main(String[] args) {
        ShapeGenerator g = new ShapeGenerator(10);
        Player p = new Player(5);
        
        
        while(g.hasNextShape() && !p.isStackFull()){
            Shape s = g.nextShape();
            p.play(s);
        }
        
    }
    
}
