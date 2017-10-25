/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

/**
 *
 * @author gaurav.sharma
 */
public class DemoString {

    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = "hello";

        if (str1 == str2) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }

        String str3 = new String("Hello");
        String str4 = new String("hEllO");

        if (str3.equalsIgnoreCase(str4)) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }

        if (str1.equals(str3)) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }


           System.out.println(str1.length());
           
       String str11 = "hElLosdgsdfgdfSDFGSDF";
       
       String str20 =   str11.toUpperCase();
       System.out.println(str11);
        System.out.println(str20);
        
        String str14 = " hello ";
        System.out.println(str14.trim());
        
        String str15 = "java";
        char ch = str15.charAt(3);
        System.out.println(ch);
           

    }
}
