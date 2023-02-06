
import java.util.Scanner;

// В этом классе определяется целочисленный стек,
// который может содержать 10 значений
class Stack {
    private int stck[];
    private int tos;
    
    // Выделение памяти под стек и инициализация его
    Stack(int size) {
        stck = new int[size];
        tos = -1;
    }
    
    // разместить элемент в стеке
    void push(int item) {
        if(tos==stck.length-1)
            // использование свойства длины массива
            System.out.println("Стек заполнен.");
        else
            stck[++tos] = item;
    }
    
    // извлечь элемент из стека
    int pop() {
        if(tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        }
        else
            return stck[tos--];
    }
}
public class TestStack2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Введите размер стека: ");
        int size = sc.nextInt();
        
        Stack mystack = new Stack(size);
        
        // Разместить числа в стеке
        for(int i = 0; i < size; i++) mystack.push(i);
        
        // извлечь эти числа из стека
        System.out.println("Стек в mystack:");
        for(int i = 0; i < size; i++)
            System.out.print(mystack.pop() + " ");
        
    }
}
