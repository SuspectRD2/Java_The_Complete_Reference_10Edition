// Демонстрация применения внутреннего класса
class Outer {
        int outer_x = 100;
        
        void test() {
            Inner inner = new Inner();
            inner.display();
        }
        
        // Это внутренний класс
        class Inner {
            int y = 10; // y - локальная переменная класса Inner
            
            void display() {
                System.out.println("Вывод: outer_x = " + outer_x);
            }
        }
        
        // ошибка, здесь переменная y недоступна! 
        //void showy() {
        //    System.out.println(y): 
        //}
}

public class InnerClassDemo {
    public static void main(String args[]) {
        Outer outer = new Outer();
        outer.test();
    }
}
