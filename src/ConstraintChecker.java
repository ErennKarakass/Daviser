import java.util.*;

/** Will return all relevant hard-rule failures or soft warnings for a proposed assignment. */
public class ConstraintChecker {
    private Timetable timetable;
    private List<SpecialRequest> requests;

    public ConstraintChecker(Timetable timetable, List<SpecialRequest> requests) {
        this.timetable = timetable; this.requests = requests;
    }

    public List<String> checkHard(Session session, TimeSlot slot, Room room) {
        throw new UnsupportedOperationException("Planned feature: not implemented in Code v1.");
    }

    public List<String> checkSoft(Session session, TimeSlot slot, Room room) {
        throw new UnsupportedOperationException("Planned feature: not implemented in Code v1.");
    }
}
