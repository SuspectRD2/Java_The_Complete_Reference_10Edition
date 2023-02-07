/**
 * В иерархии классов закрытые члены остаются
 * закрытыми в пределах своего класса.
 * Эта программа содержит ошибку, и поэтому
 * она не подлежит компиляции.
 */
class A {
    int i;          // этот член открыт по умолчанию
    private int j;  // а этот член закрыт в классе А
    
    void stij(int x, int y) {
        i = x;
        j = y;
    }
}

// Член j класса А в этом классе недоступен
class B extends A {
    int total;
    
    void sum() {
        total = i + j; // ОШИБКА: член j в этом классе недоступен
    }
}

public class Access {
    public static void main(String args[]) {
        B subOb = new B();
        
        subOb.setij(10, 20);
        
        subOb.sum();
        System.out.println("Сумма равна: " + subOb.total);
    }
}
