/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

/**
 *
 * @author gaurav.sharma
 */
public class Student {
    int rollno;
    String name;
    double marks;
    char grade;
        void getData()
        {
            rollno = 1001;
            name = "Amit";
            marks = 89.23;
            grade = 'A';
        }
        void showData()
        {
            System.out.println("Student Rollno : " + rollno );
            System.out.println("Student Name : " + name );
            System.out.println("Student Marks : " + marks );
            System.out.println("Student Grade : " + grade );
        }
    public static void main(String[] args) {
    
        Student s1 = new Student();
        s1.getData();
        s1.showData();
        
    }
    
}
