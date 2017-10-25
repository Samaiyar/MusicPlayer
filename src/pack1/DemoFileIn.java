/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.io.*;

/**
 *
 * @author gaurav.sharma
 */
public class DemoFileIn {

    public static void main(String[] args) {
        try {
            /*
            File f1 = new File("D:\\file1.txt");
            FileReader fr = new FileReader(f1);
            BufferedReader br = new BufferedReader(fr);
            */
BufferedReader br= new BufferedReader(new FileReader(new File("D:\\file1.txt")));
            
            String str =  br.readLine();
            while(str!=null)
            {
               System.out.println(str); 
               str =  br.readLine();
            }
            br.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}
