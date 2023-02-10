// Пример реализации интерфейса

interface Callback {
    void callback(int param);
}

class Client implements Callback {
    public void callback(int p) {
        System.out.println("Метод callback(), вызываемый со значением " + p);
    }
    
    void nonIfaceMath() {
        System.out.println("В классах, реализующих интерфейсы, "
                + "могут определяться и другие члены");
    }
}

class AnotherClient implements Callback {
    public void callback(int p) {
        System.out.println("Ещё один вариант метода callback()");
        System.out.println("p в квадрате равно " + (p*p));
    }
}

public class TestIface {
public static void main(String args[]) {
        Callback c = new Client();
        AnotherClient ac = new AnotherClient();
        
        c.callback(42);
        
        c = ac; // теперь переменная ссылается на объект типа AnotherClient
        
        c.callback(42);
    }
}
