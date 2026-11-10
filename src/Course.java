import java.util.*;

/** Stores a course and creates a fresh theory/laboratory block list when requested. */
public class Course {
    private String code;
    private String title;
    private int year;
    private Instructor instructor;
    private int theoryHours;
    private int labHours;
    private int students;

    public Course(String code, String title, int year, Instructor instructor, int theoryHours, int labHours, int students) {
        this.code = code; this.title = title; this.year = year; this.instructor = instructor; this.theoryHours = theoryHours; this.labHours = labHours; this.students = students;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public int getStudents() {
        return students;
    }

    public List<Session> createSessions() {
        List<Session> result = new ArrayList<>();
        if (theoryHours > 0) result.add(new Session(this, "T", theoryHours));
        if (labHours > 0) result.add(new Session(this, "L", labHours));
        return result;
    }
}
