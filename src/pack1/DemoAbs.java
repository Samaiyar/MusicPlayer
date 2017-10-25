/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

/**
 *
 * @author gaurav.sharma
 */
abstract class Shape {
    abstract void area();
    abstract void color();
    void angle() {
    }
}

class Tr extends Shape {
    @Override
    void area() {
        System.out.println("Area of TR is : 456");
    }

    @Override
    void color() {
        System.out.println("Color of TR is : Blue");
    }

    @Override
    void angle() {
        System.out.println("Angles of TR is : 3");
    }
}

class Cr extends Shape {

    @Override
    void area() {
        System.out.println("Area of Cr is 789");
    }

    @Override
    void color() {
        System.out.println("Colr of Cr is : Red");
    }
        
    
}

public class DemoAbs {

    public static void main(String[] args) {
        
        Tr t1 = new Tr();
        t1.area();
        t1.color();
        t1.angle();
        
        Cr c1 = new Cr();
        c1.area();
        c1.color();
        
        
    }
}
