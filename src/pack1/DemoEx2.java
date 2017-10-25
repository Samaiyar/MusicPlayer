/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

/**
 *
 * @author gaurav.sharma
 */
public class DemoEx2 {

    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
            
        }
        finally
        {
            System.out.println("Finally");  
        }
        System.out.println("Hello");
    }
}
