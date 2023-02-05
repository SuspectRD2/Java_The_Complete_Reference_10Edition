// Простой пример рекурсии
class Factorial {  
    // Это рекурсивный метод
    int fact(int n) {
        int result;
        if(n==1) return 1;
        result = fact(n-1) * n;
        return result;
    }
}

class RecTest {
    int values[];
    
    RecTest(int i) {
        values = new int[i];
    }
    
    // Вывести рекурсивно элементы массива
    void printArray(int i) {
        if(i==0) return;
        else printArray(i-1);
        System.out.println("[" + (i-1) + "] " + values[i-1]);
    }
}

public class Recursion {
    public static void main(String args[]) {
        Factorial f = new Factorial();
        RecTest ob = new RecTest(10);
        int i;
        
        for(i = 0; i < 10; i++) ob.values[i] = i;
        
        ob.printArray(10);
        
        System.out.println("Факториал 3 равен " + f.fact(3));
        System.out.println("Факториал 4 равен " + f.fact(4));
        System.out.println("Факториал 5 равен " + f.fact(5));
    }
}
