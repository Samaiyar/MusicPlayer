/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author gaurav.sharma
 */
public class DemoFileWrite {
    
    public static void main(String[] args) {
        try
        {
            int rollno;
            String name;
            float marks;
            
            Scanner s1 = new Scanner(System.in);
            System.out.println("Enter Rollno ");
            rollno = s1.nextInt();
            System.out.println("Enter Name ");
            name = s1.next();
            System.out.println("Enter Marks ");
            marks = s1.nextFloat();
            
        File f1 = new File("D:\\student20.txt");
        FileWriter fw = new FileWriter(f1);
        PrintWriter pw = new PrintWriter(fw);
        
        pw.println(rollno);
        pw.println(name);
        pw.println(marks);
        
        pw.close();
        
        
            System.out.println("Rollno is : "  +rollno);
            System.out.println("Name is : "  +name);
            System.out.println("Marks is : "  +marks);
                
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }    
}
