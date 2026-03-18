package com.gla.college;
import com.gla.college.student.Student;
import com.gla.college.faculty.Faculty;
public class Runner{
    public static void main(String[] args) {
        Student s = new Student();
        Faculty f = new Faculty();
        s.displayStudent();
        f.displayFaculty();
    }
}