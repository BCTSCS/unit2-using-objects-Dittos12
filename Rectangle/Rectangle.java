import greenfoot.*;

public class Rectangle extends Actor {
    private int width;
    private int height;
    
    public Rectangle(int w, int h) {
        width = w;
        height = h;
        getImage().scale(width*10,height*10);
    }
    
    public Rectangle(int s) {
        width = s;
        height = s;
        getImage().scale(width*10,height*10);
    }
    public Rectangle() {
        width = 10;
        height = 10;
        getImage().scale(width*10,height*10);
    }
    
    public int getArea() {
        int area = width*height;
        return area;
    }
    
    public void printArea() {
        int area = width*height;
        System.out.println(area);
    }
    
    public static void main(String[] args) {
        
    }
    
    public String toString() {
        return "Rectangle"+System.identityHashCode(this)+" width "+width+" height "+height;
    }
}
