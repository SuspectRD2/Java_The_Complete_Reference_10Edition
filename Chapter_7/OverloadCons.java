/**
 * В этой версии класса Box один объект допускается
 * инициализировать другим объектом
 */

class Box {
    double width;
    double height;
    double depth;
    
    // Обратите внимание на этот конструктор. В качестве
    // параметра в нем используется объект типа Box.
    Box(Box ob) { // передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    
    // Конструктор, используемый, когда
    // указываются все размеры
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    
    // Конструктор, используемый, когда
    // ни один из размеров не указан
    Box() {
        width = -1;     // использовать значение -1 
        height = -1;    // обозначения неинициализированного
        depth = -1;     // параллелепипеда
    }
    
    // Конструктор, используемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }
    
    // Расчитать и возвратить объём
    double volume() {
        return width * height * depth;
    }
}

public class OverloadCons {
    public static void main(String args[]) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mybox3 = new Box(7);
        
        String st;
        
        // Создание копии объекта mybox1
        Box myclone = new Box(mybox1);
        
        double vol;
        
        // Получить объём первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объём mybox1 равен " + vol);
        
        // Получить объём второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объём mybox2 равен " + vol);
        
        // Получить объём третьего параллелепипеда
        vol = mybox3.volume();
        System.out.println("Объём mybox3 равен " + vol);
        
        // Получить объём клона
        vol = myclone.volume();
        System.out.println("Объём клона равен " + vol);
    }
}
