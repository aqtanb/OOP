package lab1.problem4;

import practice2.Student;

import java.util.Scanner;
import java.util.Vector;

public class GradeBookTest {
    public static void main(String[] args) {
        Course course = new Course("CS101 Object-oriented Programming and Design!", 3, "None",
                "This course covers principles of OOP and software design.");
        GradeBook gradeBook = new GradeBook(course);

        gradeBook.displayMessage();

        Scanner input = new Scanner(System.in);
        System.out.println("Pleasem input grades for students:  \n");
        String[] studentNames = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        Vector<Integer> studentGrades = new Vector<>();

        for (int i = 0; i < studentNames.length; i++) {
            System.out.print("Student " + studentNames[i] + ": ");
            studentGrades.add(input.nextInt());
            Student student = new Student(studentNames[i], i + 1);
            gradeBook.addStudent(student, studentGrades.get(i));
        }

        gradeBook.displayGradeReport();
    }
}