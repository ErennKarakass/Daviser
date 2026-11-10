import java.util.*;

/** Stores room identity, type, capacity and availability; suitability checks are planned. */
public class Room {
    private String id;
    private String type;
    private int capacity;
    private List<TimeSlot> unavailableSlots;

    public Room(String id, String type, int capacity) {
        this.id = id; this.type = type; this.capacity = capacity; unavailableSlots = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isSuitableFor(Session session) {
        throw new UnsupportedOperationException("Planned feature: not implemented in Code v1.");
    }

    public boolean isAvailable(TimeSlot slot) {
        throw new UnsupportedOperationException("Planned feature: not implemented in Code v1.");
    }
}
