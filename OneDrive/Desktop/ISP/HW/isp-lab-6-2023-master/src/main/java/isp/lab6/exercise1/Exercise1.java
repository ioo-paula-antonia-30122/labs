package isp.lab6.exercise1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        Student student=new Student("Popescu Maria","001");
        Student student1=new Student("Ignat Mircea","002");

        GradeBook gradeBook=new GradeBook(students);

        gradeBook.addStudent(student);
        gradeBook.addStudent(student1);

        gradeBook.addGrade("001","Informatica",10);
        gradeBook.addGrade("001", "Romana",9);

        gradeBook.addGrade("002","Romana",9);
        gradeBook.addGrade("002","Matematica",8);

        gradeBook.calculateAverage("001");
        gradeBook.calculateAverage("002");

        System.out.println("First list: ");
        gradeBook.displayStudents();

        gradeBook.removeStudent("002");
        gradeBook.updateStudent("001", "Pop George","003","Romana",10);

        System.out.println("Updated list: ");
        gradeBook.displayStudents();

        gradeBook.updateStudent("003", "Pop George","001","Informatica",7);
        gradeBook.displayStudents();

        gradeBook.updateStudent("001", "Pop George","003","Informatica",7);
        gradeBook.updateStudent("003", "Pop George","003","Informatica",7);
    }
}
