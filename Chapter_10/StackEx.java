// В этом классе определяется целочисленный стек,
// который может содержать 10 значений
class StackFullException extends Exception {
    int size;
    
    StackFullException(int s) { size = s; }
    
    public String toString() {
        return "\nСтек заполнен. Максимальный размер стека: " + size;
    }
}

class StackEmptyException extends Exception {
    public String toString() {
        return "\nСтек пуст.";
    }
}

class Stack {
    private int stck[];
    private int tos;
    
    // Выделение памяти под стек и инициализация его
    Stack(int size) {
        stck = new int[size];
        tos = -1;
    }
    
    // разместить элемент в стеке
    void push(int item) throws StackFullException {
        if(tos==stck.length-1)
            throw new StackFullException(stck.length);
            
        stck[tos] = item;
        tos++;
    }
    
    // извлечь элемент из стека
    int pop() throws StackEmptyException {
        if(tos == 0) 
            throw new StackEmptyException();   
        tos--;
        return stck[tos];
    }
}
public class StackEx {
    public static void main(String args[]) {
        Stack mystack1 = new Stack(5);
        Stack mystack2 = new Stack(8);
        
        // Разместить числа в стеке
        for(int i = 0; i < 5; i++) mystack1.push(i);
        for(int i = 0; i < 8; i++) mystack2.push(i);
        
        // извлечь эти числа из стека
        System.out.println("Стек в mystack1:");
        for(int i = 0; i < 5; i++)
            System.out.print(mystack1.pop() + " ");
        
        System.out.println();
        
        System.out.println("Стек в mystack2:");
        for(int i = 0; i < 8; i++)
            System.out.print(mystack2.pop() + " ");
        
        // Эти операторы недопустимы
        // mystack1.tos = -2;
        // mystack2.stck[3] = 100;
    }
}
