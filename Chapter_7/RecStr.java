// Рекурсивный метод, отображающий строку задом наперед.
class NewStr {  
    public String str;
    
    NewStr(String s) {
        str = s;
    }
    // Это рекурсивный метод
    void backward(int i) {
        if(i != str.length()-1) backward(i+1);
        
        System.out.print(str.charAt(i));
    }
}

public class RecStr {
    public static void main(String args[]) {
        NewStr s = new NewStr("Съешь еще этих французских булок!");
        
        s.backward(0);
    }
}
