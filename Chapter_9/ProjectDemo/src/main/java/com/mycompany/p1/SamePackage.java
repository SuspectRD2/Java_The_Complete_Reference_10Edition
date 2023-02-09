package com.mycompany.p1;

class SamePackage {
    SamePackage() { 
        Protection р = new Protection(); 
        System.out.println("конструктор из того же самого пакета"); 
        System.out.println("n = " + p.n); 
            
        // доступно только для класса 
        // System.out.println("n_pri "+ p.n_pri); 
        
        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}

