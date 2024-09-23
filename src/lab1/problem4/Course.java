package lab1.problem4;

public class Course {
    private String courseName;
    private int credits;
    private String prerequisite;
    private String description;

    public Course(String courseName, int credits, String prerequisite, String description) {
        this.courseName = courseName;
        this.credits = credits;
        this.prerequisite = prerequisite;
        this.description = description;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredits() {
        return credits;
    }

    public String getPrerequisite() {
        return prerequisite;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return courseName + " " + credits + " credits, Prerequisite: " + prerequisite + ", Description: " + description;
    }
}
