// Расширение класса BoxWeight включением в него
// поля стоимости доставки
class Box {
    private double width;
    private double height;
    private double depth;
    
    // Сконструируем клон объекта
    Box(Box ob) { // передача объекта конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    
    // Конструктор, применяемый при указании всех размеров
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    
    // Конструктор, применяемый в отсутсвии размеров
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }
    
    // Конструктор, применяемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }
    
    // Расчитать и возвратить объём
    double volume() {
        return width * height * depth;
    }
}

// Расширить класс Box, включив в него поля веса
class BoxWeight extends Box {
    double weight; // вес параллелепипеда
    
    // Конструктор, клон объекта
    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }
    
    // Конструктор, применяемый при указании всех параметров    
    // инициализирование поля width, height, depth с помощью метода super
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d); // вызов конструктора суперкласса
        weight = m;
    }
    
    // Конструктор, применяемый в отсутсвии размеров
    BoxWeight() {
        super();
        weight = -1;
    }
    
    // Конструктор, применяемый при создании куба
    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}

// Добавление поля стоимости доставки
class Shipment extends BoxWeight {
    double cost;
    
    // Конструктор, клон объекта
    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }
    
    // Конструктор, применяемый при указании всех параметров    
    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m); // вызов конструктора суперкласса
        cost = c;
    }
    
    // Конструктор, применяемый в отсутсвии размеров
    Shipment() {
        super();
        cost = -1;
    }
    
    // Конструктор, применяемый при создании куба
    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}

public class DemoShipment {
    public static void main(String args[]) {
        Shipment sm1 = new Shipment(10, 20, 15, 10, 3.14);
        Shipment sm2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;
        
        vol = sm1.volume();
        System.out.println("Объём sm1 равен " + vol);
        System.out.println("Вес sm1 равен " + sm1.weight);
        System.out.println("Стоимость доставки sm1 равна " + sm1.cost);
        System.out.println();
        
        vol = sm2.volume();
        System.out.println("Объём sm2 равен " + vol);
        System.out.println("Вес sm2 равен " + sm2.weight);
        System.out.println("Стоимость доставки sm2 равна " + sm2.cost);
        System.out.println();
    }
}
