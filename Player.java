
import java.util.LinkedList;
import java.util.Scanner;


public class Player {
    
    private LinkedList<Shape> shapes = new LinkedList<Shape>();
    private double points = 0;
    private int N;

    public Player(int N) {
        this.N = N;
    }
    
    public boolean isStackFull(){
        if (shapes.size()>=N){
            return true;
        }else{
            return false;
        }
    }
    
    public void play(Shape newShape){
        
        if(isStackFull()){
            return;
        }
        
        printInfo();
        
        System.out.println("INSERT ["+newShape.toString()+"] ? ");
        System.out.println("1-yes");
        System.out.println("Any number-no");
        
        Scanner scan = new Scanner(System.in);
        int menu = scan.nextInt();
        
        
        if(menu == 1){
            if(shapes.size() > 0){
                Shape lastInserted = shapes.getFirst();
                if(newShape.computeArea() == lastInserted.computeArea()){
                    points = points + newShape.computeArea()*10;
                }else{
                    points = points + newShape.computeArea();
                }
                
                if(lastInserted.getType().equals(newShape.getType())){
                    shapes.removeFirst();
                }else{
                    shapes.addFirst(newShape);
                }
                
            }else{
                shapes.addFirst(newShape);
                points = points + newShape.computeArea();
            }
        }else{
            System.out.println("Shape droped...");
        }
    }

    public void printInfo(){
        System.out.println("Points: "+points);
        for(int i=0;i<shapes.size();i++){
            System.out.println(shapes.get(i).toString());
        }
        System.out.println();
    }
    
}
