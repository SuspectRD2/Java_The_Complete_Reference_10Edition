interface MyIF {
    // Это обявление обычного меода в интерфейсе.
    // Он НЕ предоставляет реализацию по умолчанию
    int getNumber();
    
    // А это объявление метода с реализацией по умолчанию.
    // Обратите внимание на его реализацию
    default String getString() {
        return "Объект типа String по умолчанию";
    }
    
    // Это объявление статического метода в интерфейсе
    static int getDefaultNumber() {
        return 0;
    }
}

// Реализация интерфейса MyIF
class MyIFImp implements MyIF {
    // В этом классе должен быть реализован только метод getNumber(),
    // определенный в интерфейсе MyIF
    // А вызов метода getString() разрешается по умолчанию
    @Override
    public int getNumber() {
        return 100;
    }
}

// Реализация интерфейса MyIF
class MyIFImp2 implements MyIF {
    // В этом класса предоставляются реализации обоих
    // методов getNumber() и getString()
    @Override
    public int getNumber() {
        return 50;
    }
    
    @Override
    public String getString() {
        return "Это другая символьная строка";
    }
}

public class DefaultMethodDemo {
    public static void main(String args[]) {
        MyIFImp obj1 = new MyIFImp();
        MyIFImp2 obj2 = new MyIFImp2();
        
        int defNum = MyIF.getDefaultNumber();
        
        System.out.println(defNum);
        
        // Метод getNumber() можно вызвать, так как он
        // явно реализован в классе MyIFImp
        System.out.println(obj1.getNumber());
        
        // Метод getString() также можно вызвать,
        // так как в интерфейсе имеется его реализация по умолчанию
        System.out.println(obj1.getString());
        
        System.out.println(obj2.getNumber());
        System.out.println(obj2.getString());
    }
}
