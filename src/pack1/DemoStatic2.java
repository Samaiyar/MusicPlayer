/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

/**
 *
 * @author gaurav.sharma
 */
class Demo3 {

    Demo3() {
        System.out.println("Class Demo3 con");
    }

    void show() {
        System.out.println("Class Demo3 show");
    }

    static {
        System.out.println("Class Demo3 Static Block");
    }
}

public class DemoStatic2 {

    public static void main(String[] args) {
        Demo3 obj = new Demo3();
        obj.show();
        
          Demo3 obj2 = new Demo3();
        obj2.show();
    }
}
