interface MyIF {
    // Это обявление обычного меода в интерфейсе.
    // Он НЕ предоставляет реализацию по умолчанию
    int getNumber();
    
    // А это объявление метода с реализацией по умолчанию.
    // Обратите внимание на его реализацию
    default String getString() {
        return "Объект типа String по умолчанию";
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

public class DefaultMethodDemo {
    public static void main(String args[]) {
        MyIFImp obj = new MyIFImp();
        
        // Метод getNumber() можно вызвать, так как он
        // явно реализован в классе MyIFImp
        System.out.println(obj.getNumber());
        
        // Метод getString() также можно вызвать,
        // так как в интерфейсе имеется его реализация по умолчанию
        System.out.println(obj.getString());
    }
}
