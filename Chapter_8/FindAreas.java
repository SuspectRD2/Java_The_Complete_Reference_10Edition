// Применение динамического полиморфизма
abstract class Figure {
    double dim1;
    double dim2;
    
    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }
    
    // теперь метод объявляется абстрактным
    abstract double area();
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }
    
    // Переопределение метода area() для четырёхугольника
    double area() {
        System.out.println("В области четырёхугольника.");
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }
    
    // Переопределение метода area() для прямоугольного треугольника
    double area() {
        System.out.println("В области треугольника.");
        return dim1 * dim2 / 2;
    }
}

public class FindAreas {
    public static void main(String args[]) {
        // Figure f = new Figure(10, 10);   // теперь недопустимо
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figure;  // верно, хотя объект не создаётся
        
        figure = r;
        System.out.println("Площадь равна " + figure.area());
        
        figure = t;
        System.out.println("Площадь равна " + figure.area());       
    }
}
