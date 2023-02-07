// В этой программе наследование применяется для расширения класса Box
// Также в классе BoxWeight использовано ключевое слово super.
class Box {
    double width;
    double height;
    double depth;
    
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

public class DemoBoxWeight {
    public static void main(String args[]) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight mybox3 = new BoxWeight(); // по умолчанию
        BoxWeight mycube = new BoxWeight(3, 2);
        BoxWeight myclone = new BoxWeight(mybox1);
        double vol;
        
        vol = mybox1.volume();
        System.out.println("Объём mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + mybox1.weight);
        System.out.println();
        
        vol = mybox2.volume();
        System.out.println("Объём mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен " + mybox2.weight);
        System.out.println();
        
        vol = mybox3.volume();
        System.out.println("Объём mybox3 равен " + vol);
        System.out.println("Вес mybox2 равен " + mybox3.weight);
        System.out.println();
        
        vol = myclone.volume();
        System.out.println("Объём myclone равен " + vol);
        System.out.println("Вес myclone равен " + myclone.weight);
        System.out.println();
        
        vol = mycube.volume();
        System.out.println("Объём mycube равен " + vol);
        System.out.println("Вес mycube равен " + mycube.weight);
        System.out.println();
    }
}
