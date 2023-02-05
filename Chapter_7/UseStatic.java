// Демонстрация статических переменных,
// методов и блоков кода
class StaticDemo {
    static int i = 42;
    static int j = 99;
    
    static void callme() {
        System.out.println("i = " + i);
    }
}

public class UseStatic {
    static int a = 3;
    static int b;
    
    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    
    static {
        System.out.println("Статический блок инициализирован.");
        b = a * 4;
    }
    
    public static void main(String args[]) {
        meth(42);
        StaticDemo.callme();
        System.out.println("j = " + StaticDemo.j);
    }
}
