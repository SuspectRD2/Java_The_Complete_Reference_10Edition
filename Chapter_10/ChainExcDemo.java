// Демонстрация цепочки исключений

public class ChainExcDemo {
    static void demoproc() {
        // Создать исключение
        NullPointerException e = new NullPointerException("верхний уровень");
        
        // Добавить причину исключений
        e.initCause(new ArithmeticException("причина"));
        
        throw e;
    }
    
    public static void main(String args[]) {
        try {
            demoproc();
        } catch(NullPointerException e) {
            // Вывести исключение верхнего уровня
            System.out.println("Перехвачено исключение: " + e);
            
            // Вывести исключение, послужившее причиной
            // для исключения верхнего уровня
            System.out.println("Первопричина: " + e.getCause());
        }
    }
}
