package com.mycompany.p2;

class OtherPackage {
    OtherPackage() {
        p1.Protection p = new p1.Protection();
        System.out.println("конструктор из другого пакета");
        
        // Доступно только для данного класса или пакета
        // System.out.println("n = " + p.n);
        
        // Доступно только для данного класса
        // System.out.println("n_pri =" + p.n_pri); 
        
        // Доступно только для данного класса, подкласса или пакета 
        // System.out.println("n_pro = " + p.n_pro); 
        
        System.out.println("n_pub = " + n_pub);
    }
}
