package isp.lab6.exercise1;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestExercise1 {

    @Test
    public void testAddStudent() {
        List<Student> students = new ArrayList<>();
        Student student = new Student("Popescu Maria", "001");

        GradeBook gradeBook = new GradeBook(students);
        gradeBook.addStudent(student);

        int counter = gradeBook.getStudents().size();
        Assert.assertEquals(1, counter);
    }

    @Test
    public void testRemoveStudent() {
        List<Student> students = new ArrayList<>();
        Student student = new Student("Popescu Maria", "001");

        GradeBook gradeBook = new GradeBook(students);
        gradeBook.addStudent(student);

        int counter = gradeBook.getStudents().size();
        Assert.assertEquals(1, counter);

        gradeBook.removeStudent(student.getID());
        Assert.assertEquals(0, gradeBook.getStudents().size());
    }

    @Test
    public void testUpdateStudent() {
        List<Student> students = new ArrayList<>();
        Student student = new Student("Popescu Maria", "001");

        GradeBook gradeBook = new GradeBook(students);
        gradeBook.addStudent(student);

        gradeBook.addGrade("001", "Romana", 10);

        gradeBook.updateStudent("001", "Pop Cristian", "002", "Romana", 5);
        Assert.assertEquals("002", student.getID());
        Assert.assertEquals("Pop Cristian", student.getName());

        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("Romana", 5);

        Assert.assertEquals(expected, student.getGrade());
    }

    @Test
    public void testDisplay() {

    }
}
