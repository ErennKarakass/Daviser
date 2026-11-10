import java.util.*;

/** Stores one teaching block and its optional assignment; only the planned validated Timetable operations may assign it in the user workflow. */
public class Session {
    private Course course;
    private String type;
    private int duration;
    private TimeSlot assignedSlot;
    private Room assignedRoom;

    public Session(Course course, String type, int duration) {
        this.course = course; this.type = type; this.duration = duration;
    }

    public String getId() {
        return course.getCode() + "-" + type;
    }

    public Course getCourse() {
        return course;
    }

    public int getDuration() {
        return duration;
    }

    public String getRequiredRoomType() {
        return type.equals("L") ? "Laboratory" : "Classroom";
    }

    public boolean isAssigned() {
        return assignedSlot != null && assignedRoom != null;
    }

    public TimeSlot getAssignedSlot() {
        return assignedSlot;
    }

    public Room getAssignedRoom() {
        return assignedRoom;
    }

    public void setAssignment(TimeSlot slot, Room room) {
        assignedSlot = slot; assignedRoom = room;
    }

    public void clearAssignment() {
        assignedSlot = null; assignedRoom = null;
    }
}
