/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

/**
 *
 * @author gaurav.sharma
 */

interface inter1
{
    int x=10;
    public void fun1();
    public void fun2();
    public void fun3();    
}

interface inter2 extends inter1
{
    
    public void fun4();
    public void fun5();
    
}


class B2
{
    
   void show()
   {
       
   }
    
}


class A3 extends B2 implements inter2
{
    @Override
    public void fun1() {
        System.out.println("Fun1" + inter1.x);
    }

    @Override
    public void fun2() {
      System.out.println("Fun2");
    }

    @Override
    public void fun3() {
      System.out.println("Fun3");
    }

    @Override
    public void fun4() {
       System.out.println("Fun4");
    }

    @Override
    public void fun5() {
       System.out.println("Fun5");
    }

}


public class DemoInter {
    public static void main(String[] args) {
        A3 a1 = new A3();
        a1.fun1();
        a1.fun2();
        a1.fun3();
        a1.fun4();
        a1.fun5();
    }
    
}
