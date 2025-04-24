package isp.lab6.exercise1;

import java.util.HashMap;

public class Student {

    private String name;
    private String ID;
    private HashMap<String, Integer> grades;

    public Student(String name, String ID) {
        this.name = name;
        this.ID = ID;
        this.grades = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setGrades(HashMap<String, Integer> grades) {
        this.grades = new HashMap<>(grades);
    }

    public HashMap<String, Integer> getGrade() {
        return grades;
    }


    public void addGrade(String subject, Integer grade) {
        grades.put(subject, grade);
    }



    @Override
    public String toString() {
        return "Student {" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", grades=" + grades +
                '}';
    }
}


