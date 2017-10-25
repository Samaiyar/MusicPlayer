/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author gaurav.sharma
 */
public class DemoGui1 {

    JFrame f1;
    JPanel p1;

    DemoGui1() {
        f1 = new JFrame();
        p1 = new JPanel();
    }

    void display() {
        f1.setSize(500, 500);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(null);        
        f1.setTitle("My Frame");
        p1.setSize(200,200);
        p1.setBackground(Color.RED);
        
        f1.add(p1);
                
        f1.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        DemoGui1 obj = new DemoGui1();
        obj.display();
        
    }
    
}
