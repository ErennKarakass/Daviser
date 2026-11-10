import java.util.*;

/** Will hold the canonical session list and manage validated assignments, moves and removals. */
public class Timetable {
    private List<Session> sessions;

    public Timetable() {
        sessions = new ArrayList<>();
    }

    public List<Session> getSessions() {
        return Collections.unmodifiableList(sessions);
    }

    public void setSessions(List<Session> sessions) {
        throw new UnsupportedOperationException("Planned feature: not implemented in Code v1.");
    }

    public void assign(Session session, TimeSlot slot, Room room, ConstraintChecker checker) {
        throw new UnsupportedOperationException("Planned feature: not implemented in Code v1.");
    }

    public void modifyAssignment(Session session, TimeSlot slot, Room room, ConstraintChecker checker) {
        throw new UnsupportedOperationException("Planned feature: not implemented in Code v1.");
    }

    public void removeAssignment(Session session) {
        throw new UnsupportedOperationException("Planned feature: not implemented in Code v1.");
    }
}
