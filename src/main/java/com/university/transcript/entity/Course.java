import java.util.Date;

public class Course {
    private String courseCode;
    private String courseName;
    private int credits;
    private String instructor;
    private String semester;
    private Date createdAt;

    public Course(String courseCode, String courseName, int credits, String instructor, String semester) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
        this.instructor = instructor;
        this.semester = semester;
        this.createdAt = new Date();
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    // No setter for createdAt, as it should be set only at creation
}