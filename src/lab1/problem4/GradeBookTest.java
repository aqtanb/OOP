package lab1.problem4;
import practice2.Student;

import java.util.Scanner;
import java.util.Vector;

public class GradeBookTest {
    public static void main(String[] args) {
        Course course = new Course("CS101 Object-oriented Programming and Design", 3, "None",
                "This course covers principles of OOP and software design");
        GradeBook gradeBook = new GradeBook(course);



        Scanner input = new Scanner(System.in);
        Vector<Student> students = new Vector<>();
        String[] studentNames = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        Vector<Integer> studentGrades = new Vector<>();

        System.out.println("Please input grades for students: \n");

        for (int i = 0; i < studentNames.length; i++) {
            Student student = new Student(studentNames[i], i + 1);
            students.add(student);

            System.out.print(student.toString() + ": ");
            int grade = input.nextInt();
            studentGrades.add(grade);

            gradeBook.addStudent(student, grade);
        }

        gradeBook.displayGradeReport();
    }
}
