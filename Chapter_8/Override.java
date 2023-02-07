// Переопределение метода
class A {
    int i, j;
    
    A(int a, int b) {
        i = a;
        j = b;
    }
    
    // вывод содержимого переменных i и j
    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}

class B extends A {
    int k;
    
    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    
    // вывод содержимого переменной k с помощью метода
    // переопределяющего метод sho() из класса А
    void show() {
        super.show();
        System.out.println("k: " + k);
    }
}

public class Override {
    public static void main(String args[]) {
        B b = new B(1, 2, 3);
        b.show();   // здесь вызывается метод show() из класса В
    }
}
