abstract class TwoDShape {
    private double width;
    private double height;
    private String name;
    
    TwoDShape() {
        width = height = -1;
        name = "none";
    }
    
    TwoDShape(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }
    
    TwoDShape(double x, String n) {
        width = height = x;
        name = n;
    }
    
    TwoDShape(TwoDShape ob) {
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }
    
    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }
    
    String getName() { return name; }
    
    void ShowDim() {
        System.out.println("Ширина и высота - " + width + " и " + height);
    }
    
    abstract double area();
}

class Circle extends TwoDShape {
    
    Circle() {
        super();
    }
    
    Circle(double x) {
        super(x, "circle");
    }
    
    Circle(Circle ob) {
        super(ob);
    }
    
    @Override
    double area() {
        return (getWidth() / 2) * (getWidth() / 2) * 3.14;
    }
    
}
public class Shape {
    public static void main(String args[]) {
        Circle c = new Circle(10.0);
        
        System.out.println("Площать circle " + c.area());
    }
}
