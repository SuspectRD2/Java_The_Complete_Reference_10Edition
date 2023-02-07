// Демонстрация поряка вызова конструкторов

// Создание суперкласса
class A {
    A() {
        System.out.println("В конструкторе А");
    }
}

// Создание подкласса петём расширения класса А
class B extends A {
    B() {
        System.out.println("В констрвукторе B");
    }
}

// Ещё один подкласса, расширяющий класса В
class C extends B {
    C() {
        System.out.println("В констрвукторе C");
    }
}

public class CallingCons {
    public static void main(String args[]) {
        C c = new C();
    }
}
