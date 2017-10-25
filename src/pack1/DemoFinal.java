/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

/**
 *
 * @author gaurav.sharma
 */
class A {
    A() {
        System.out.println("Class A  Con ");
    }
    A(int x,int y) {
        int z=x+y;
        System.out.println("Sum is :  " + z);
    }
}

class B extends A {
    B() {
       super(12,45);
        System.out.println("Class B Con");
    }
}

public class DemoFinal {

    public static void main(String[] args) {
        B obj = new B();
    }
}
