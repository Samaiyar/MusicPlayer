/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author gaurav.sharma
 */
public class LoginPage implements ActionListener {

    JFrame f1, f2;
    JLabel l1, l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1, b2;
    
    public LoginPage() {
        f1 = new JFrame();
        f2 = new JFrame("New Frame");
        l1 = new JLabel("User name");
        l2 = new JLabel("Password");
        t1 = new JTextField();
        t2 = new JPasswordField();
        b1 = new JButton("Ok");
        b2 = new JButton("Exit");
    }

    void display() {
        f1.setSize(500, 500);
        f2.setSize(200, 200);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setTitle("Login page");
        f1.setLayout(null);
        l1.setBounds(80, 80, 100, 30);
        l2.setBounds(80, 250, 100, 30);
        t1.setBounds(250, 80, 100, 30);
        t2.setBounds(250, 250, 100, 30);
        b1.setBounds(100, 350, 100, 30);
        b2.setBounds(300, 350, 100, 30);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        f1.add(l1);
        f1.add(l2);
        f1.add(t1);
        f1.add(t2);
        f1.add(b1);
        f1.add(b2);
        f1.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == b1) {
            f2.setVisible(true);
        }
        
        if (e.getSource() == b2) {
            System.exit(0);
        }
        
    }
    
    public static void main(String[] args) {
        
        new LoginPage().display();
        
    }
}
