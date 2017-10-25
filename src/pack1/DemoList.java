/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author gaurav.sharma
 */
public class DemoList {
    
    public static void main(String[] args) {
        
        
        
        Integer i1 = new Integer(10);
        String str1 = "hello";
        String str2 = new String("Java");
        Double d1 = new Double(56.23);
        Integer i2 = new Integer(10);
        
        List l1 = new ArrayList();
        
        List l2 = new ArrayList();
        
        l1.add(i1);
        l1.add(str1);
        l1.add(str2);
        l1.add(d1);
        l1.add(i2);
  
        System.out.println(l1); 
     
        ListIterator it = l1.listIterator();
        
        while( it.hasNext() )
        {
            System.out.println(it.next());
        }
        
        System.out.println("*********************8");
          while( it.hasPrevious() )
        {
            System.out.println(it.previous());
        }
        
    }
    
}
