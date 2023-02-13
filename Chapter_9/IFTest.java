// Определение интерфейса для целочисленного стека
interface IntStack {
    void push(int item); // сохранить элемент в стеке
    int pop(); // извлечь элемент в стеке
}

// Статический стек
class FixedStack implements IntStack {
    private int stck[];
    private int tos;
    
    // Выделение памяти и инициализация стека
    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }
    
    // Разместить элемент в стеке
    @Override
    public void push(int item) {
        if(tos==stck.length-1) // использовать поле длины стека
            System.out.println("Стек заполнен.");
        else
            stck[++tos] = item;
    }
    
    // извлечь элемент из стека
    @Override
    public int pop() {
        if(tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        }
        else
            return stck[tos--];
    }
    
}

// Динамический стек
class DynStack implements IntStack {
    private int stck[];
    private int tos;
    
    // Выделение памяти и инициализация стека
    DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }
    
    // Разместить элемент в стеке
    @Override
    public void push(int item) {
        // Если стек заполнен, выделить память
        // под стек большего размера
        if(tos==stck.length-1) {
            int temp[] = new int[stck.length * 2];
            // Удвоить размер стека
            for(int i = 0; i < stck.length; i++) 
                temp[i] = stck[i];
            stck = temp;
            stck[++tos] = item;
        } else
            stck[++tos] = item;
    }
    
    // извлечь элемент из стека
    @Override
    public int pop() {
        if(tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        } else
            return stck[tos--];
    }  
}

public class IFTest {
    public static void main(String args[]) {
        FixedStack fs1 = new FixedStack(5);
        FixedStack fs2 = new FixedStack(8);
        
        DynStack fs3 = new DynStack(5);
        DynStack fs4 = new DynStack(8);
        
        // разместить числа в стеке
        for(int i = 0; i < 5; i++) fs1.push(i);
        for(int i = 0; i < 8; i++) fs2.push(i);
        
        for(int i = 0; i < 12; i++) fs3.push(i);
        for(int i = 0; i < 20; i++) fs4.push(i);
        
        // извлечь эти числа из стека
        System.out.print("Стек в fs1: ");
        for(int i = 0; i < 5; i++)
            System.out.print(fs1.pop() + " ");
        System.out.println();
        
        System.out.print("Стек в fs2: ");
        for(int i = 0; i < 8; i++)
            System.out.print(fs2.pop() + " ");
        System.out.println();
        
        System.out.print("Стек в fs3: ");
        for(int i = 0; i < 12; i++)
            System.out.print(fs3.pop() + " ");
        System.out.println();
        
        System.out.print("Стек в fs4: ");
        for(int i = 0; i < 20; i++)
            System.out.print(fs4.pop() + " ");
        System.out.println();
    }
}