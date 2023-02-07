// Динамическая диспетчеризация методов
class A {
    void callme() {
        System.out.println("В методе callme() из класса А");
    }
}

class B extends A {
    // Переопределённый метод callme()
    void callme() {
        System.out.println("В методе callme() из класса B");
    }
}

class C extends A {
    // Переопределённый метод callme()
    void callme() {
        System.out.println("В методе callme() из класса C");
    }
}

public class Dispatch {
    public static void main(String args[]) {
        A a = new A(); // объект класса A
        B b = new B(); // объект класса B
        C c = new C(); //объект класса C
        
        A r; // получить ссылку на объект типа А
        
        r = a;          // переменная r ссылается на объект типа А
        r.callme();     // вызов варианта метода callme(), определенный в классе А 
        
        r = b;          // переменная r ссылается на объект типа B
        r.callme();     // вызов варианта метода callme(), определенный в классе B 
        
        r = c;          // переменная r ссылается на объект типа C
        r.callme();     // вызов варианта метода callme(), определенный в классе C 
    }
}
