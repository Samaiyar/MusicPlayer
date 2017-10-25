/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import sun.jdbc.odbc.JdbcOdbcBatchUpdateException;

/**
 *
 * @author gaurav.sharma
 */
public class DemoGui2 extends JFrame {

    JFrame f1;
    JButton b1, b2, b3, b4, b5;
    JLabel l1, img1, bgi1;
    JTextField tf1;
    JPasswordField pf1;
    JTextArea ta1;
    JRadioButton r1, r2;
    ButtonGroup bg1;
    JCheckBox c1, c2, c3;
    JComboBox cb1;
    Color co1, co2;
    Font ft1;

    DemoGui2() {
        f1 = new JFrame();
       // b1 = new JButton("Save");
//        b2 = new JButton("Exit");
//        b3 = new JButton("Open");
//        b4 = new JButton("Ok");
//        b5 = new JButton("Edit");
//        l1 = new JLabel("User name");
//
//        tf1 = new JTextField();
//
//        pf1 = new JPasswordField();
//
//        ta1 = new JTextArea();
//
//        r1 = new JRadioButton("Male");
//        r2 = new JRadioButton("Female");
//
//        bg1 = new ButtonGroup();
//        c1 = new JCheckBox("asdasd");
//        c2 = new JCheckBox("zzzzzz");
//        c3 = new JCheckBox("rrrrrr");
//        cb1 = new JComboBox();
//        co1 = new Color(255, 255, 0);
//        co2 = new Color(0, 0, 255);
//        ft1 = new Font("Times New Roman", Font.ITALIC, 25);
        img1 = new JLabel(new ImageIcon("images\\Desert.jpg"));
//        bgi1 = new JLabel(new ImageIcon("C:\\Users\\Public\\Pictures\\Sample Pictures\\Penguins.jpg"));
    }

    void display() {



        f1.setSize(500, 500);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setTitle("My Frame");
//        f1.setLayout(null);
//        img1.setBounds(80, 80, 100, 100);
//        l1.setBounds(200, 80, 100, 100);
//        bgi1.setBounds(0, 0, 500, 500);
//
////        tf1.setBackground(Color.RED);
////        tf1.setForeground(co1);
        f1.add(img1);
   //     f1.add(l1);
//
//
//        f1.add(bgi1);
        f1.setVisible(true);
    }

    public static void main(String[] args) {
        DemoGui2 f1 = new DemoGui2();
        f1.display();


    }
}
