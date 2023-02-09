// Демонстрационный пакет p1
package com.mycompany.p1;

// Получение экземпляры различных классов из пакета p1
public class Demo {
    public static void main(String args[]) {
        Protection ob1 = new Protection();
        Derived ob2 = new Derived();
        SamePackage ob3 = new SamePackage();
    }
}
