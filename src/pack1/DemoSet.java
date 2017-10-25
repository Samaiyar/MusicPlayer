/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author gaurav.sharma
 */
public class DemoSet {
    
    public static void main(String[] args) {
        
        
        Integer i1 = new Integer(10);
        String str1 = "hello";
        String str2 = new String("Java");
        Double d1 = new Double(56.23);
        Integer i2 = new Integer(10);
        
        Set s1 = new HashSet();
        
        s1.add(i1);
        s1.add(str1);
        s1.add(str2);
        s1.add(d1);
        s1.add(i2);
        
        
        Iterator it = s1.iterator();
        
        while( it.hasNext() )
        {
            System.out.println(it.next());
        }
        
        
        
        //System.out.println(s1);
        
        
        
      //  System.out.println(s1);
        
        
    }
    
}
