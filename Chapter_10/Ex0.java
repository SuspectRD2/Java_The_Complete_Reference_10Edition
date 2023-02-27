// Применение блоков операторов try и catch
public class Ex0 {
    public static void main(String args[]) {
        int d, a;
        
        try { // проконтролировать блок кода
            d = 0;
            a = 42 / d;
            System.out.println("Это не будет выведено");
        } catch (ArithmeticException e) {
            System.out.println("Catch: Деление на нуль.");
        }
        
        System.out.println("После оператора catch.");
    }
}
