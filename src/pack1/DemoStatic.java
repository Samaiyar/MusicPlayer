/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

/**
 *
 * @author gaurav.sharma
 */
class Demo2 {
    static int x, y;
}
public class DemoStatic {
    public static void main(String[] args) {
        Demo2 obj1 = new Demo2();
        obj1.x = 10;
        obj1.y = 20;
        Demo2 obj2 = new Demo2();
        System.out.println(obj2.x);
        System.out.println(obj2.y);
    }
}
