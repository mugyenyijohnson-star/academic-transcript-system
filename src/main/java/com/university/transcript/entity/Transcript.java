import java.util.List;
import java.time.LocalDateTime;

public class Transcript {
    private String studentId;
    private String studentName;
    private List<String> courses;
    private double gpa;
    private int totalCredits;
    private LocalDateTime lastUpdated;

    // Constructor
    public Transcript(String studentId, String studentName, List<String> courses, double gpa, int totalCredits) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.courses = courses;
        this.gpa = gpa;
        this.totalCredits = totalCredits;
        this.lastUpdated = LocalDateTime.now();
    }

    // Getters and Setters for each field
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}