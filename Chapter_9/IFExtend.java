// Один интерфейс может расширять другой
interface A {
    void meth1();
    void meth2();
}

// Теперь интерфейс B включает в себя методы meth1()
// и meth2() и добавляет meth3()
interface B extends A {
    void meth3();
}

// Этот класс должен реализовать все методы
// из интерфейсов А и В
class MyClass implements B {
    @Override
    public void meth1() {
        System.out.println("Реализация метода meth1()");
    }
    
    @Override
    public void meth2() {
        System.out.println("Реализация метода meth2()");
    }
    
    @Override
    public void meth3() {
        System.out.println("Реализация метода meth3()");
    }
}

public class IFExtend {
    public static void main(String args[]) {
        MyClass ob = new MyClass();
        
        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}
