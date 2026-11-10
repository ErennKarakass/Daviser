import java.util.*;

/** Stores instructor identity, unavailability and preferences; availability logic is planned. */
public class Instructor {
    private String id;
    private String name;
    private List<TimeSlot> unavailableSlots;
    private List<TimeSlot> preferredSlots;

    public Instructor(String id, String name) {
        this.id = id; this.name = name; unavailableSlots = new ArrayList<>(); preferredSlots = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isAvailable(TimeSlot slot) {
        throw new UnsupportedOperationException("Planned feature: not implemented in Code v1.");
    }

    public boolean prefers(TimeSlot slot) {
        throw new UnsupportedOperationException("Planned feature: not implemented in Code v1.");
    }
}
