package lab1.problem4;

import practice2.Student;

import java.util.ArrayList;

class GradeBook {
    private Course course;
    private ArrayList<Student> students;
    private ArrayList<Integer> grades;

    public GradeBook(Course course) {
        this.course = course;
        this.students = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void addStudent(Student student, int grade) {
        students.add(student);
        grades.add(grade);
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.getCourseName() + "!\n");
    }

    public void displayGradeReport() {
        double total = 0;
        int lowest = Integer.MAX_VALUE;
        int highest = Integer.MIN_VALUE;
        String lowestStudent = "", highestStudent = "";

        System.out.println("Grades for students:");
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            int grade = grades.get(i);
            System.out.println(student.getName() + " (ID: " + student.getId() + "): " + grade);
            total += grade;

            if (grade < lowest) {
                lowest = grade;
                lowestStudent = student.getName();
            }
            if (grade > highest) {
                highest = grade;
                highestStudent = student.getName();
            }
        }

        double average = total / students.size();
        System.out.println("\nClass average is " + determineClassAverage() +
                ". Lowest grade is " + lowest + " " + lowestStudent.toString() +
                " Highest grade is " + highest + " " + highestStudent.toString());

        outputBarChart();
    }

    private void outputBarChart() {
        int[] distribution = new int[11];

        for (int grade : grades) {
            distribution[grade / 10]++;
        }

        System.out.println("\nGrades distribution:");
        for (int i = 0; i < distribution.length; i++) {
            System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
            for (int j = 0; j < distribution[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public double determineClassAverage() {
        double total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return total / grades.size();
    }

    @Override
    public String toString() {
        return students + " " + grades;
    }
}
