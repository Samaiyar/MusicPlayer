/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

/**
 *
 * @author gaurav.sharma
 */
public class DemoFun1 {
    int age;
    void show()
    {
    System.out.println("Age in show " + age);
    }
    public static void main(String[] args) {
        DemoFun1 obj = new DemoFun1();
        obj.age=78;
        obj.show();
    }
}
