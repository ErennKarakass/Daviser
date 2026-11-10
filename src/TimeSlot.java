import java.util.*;

/** Stores one consecutive teaching interval; validates bounds and checks overlap. */
public class TimeSlot {
    private int day;
    private int startHour;
    private int duration;

    public TimeSlot(int day, int startHour, int duration) {
        if (day < 1 || day > 5 || startHour < 9 || duration < 1 || startHour + duration > 17) throw new IllegalArgumentException("Invalid working-time block.");
        this.day = day; this.startHour = startHour; this.duration = duration;
    }

    public int getDay() {
        return day;
    }

    public int getStartHour() {
        return startHour;
    }

    public int getDuration() {
        return duration;
    }

    public boolean overlapsWith(TimeSlot other) {
        return day == other.day && startHour < other.startHour + other.duration && other.startHour < startHour + duration;
    }
}
