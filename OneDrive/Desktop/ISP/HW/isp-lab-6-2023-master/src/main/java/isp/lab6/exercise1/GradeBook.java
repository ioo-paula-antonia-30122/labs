package isp.lab6.exercise1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GradeBook {

    private List<Student> students;

    public GradeBook(List<Student> students) {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student " + student.getName() + " was added in GradeBook!");

    }

    public void addGrade(String ID, String subject, Integer grade) {
        for (Student student : students) {
            if (student.getID().equals(ID)) {
                student.addGrade(subject, grade);
            }
        }
    }

    public void removeStudent(String ID) {
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getID().equals(ID)) {
                students.remove(i);
                System.out.println("Student " + student.getName() + " was removed from the GradeBook!");
                return;
            }
        }
        System.out.println("Student was not found in the GradeBook!");
    }


    public void updateStudent(String ID, String newName, String newID, String subject, Integer grade) {
        boolean update = false;
        for (Student student : students) {
            if (student.getID().equals(ID)) {
                if (!student.getID().equals(newID) || !student.getName().equals(newName) || !student.getGrade().get(subject).equals(grade)) {
                    if (!student.getID().equals(newID)) {
                        student.setID(newID);
                    }
                    if (!student.getName().equals(newName)) {
                        student.setName(newName);
                    }
                    if (student.getGrade().containsKey(subject)) {
                        student.getGrade().put(subject, grade);
                    }
                    update = true;
                }
                if (update) {
                    System.out.println("Updates made for " + student.getName() + " with success!");
                } else {
                    System.out.println("There was nothing to update for " + student.getName() + "!");
                }
            }
        }
    }

    public void calculateAverage(String ID) {
        for (Student student : students) {
            if (student.getID().equals(ID)) {
                if (student.getGrade().isEmpty()) {
                    System.out.println("Student " + student.getName() + " doesn't have grades!");
                } else {
                    int sum = 0;
                    int subjects = student.getGrade().size();

                    for (int grade : student.getGrade().values())
                        sum = sum + grade;

                    double averageGrade = (double) sum / subjects;
                    System.out.println("Average grade for student " + student.getName() + " is: " + averageGrade);
                }
            }
        }
    }

    public void displayStudents() {
        for (Student student : students) {
            System.out.println(student);  // This calls toString() of Student class to print student details
        }
    }

    public List<Student> getStudents() {
        return students;
    }
}

