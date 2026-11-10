import java.util.*;

/** Will run first-fit scheduling, retain failure reasons and collect preference warnings. */
public class Scheduler {
    private Timetable timetable;
    private ConstraintChecker checker;
    private List<Room> rooms;
    private List<SpecialRequest> requests;
    private Map<Session, String> failures;
    private List<String> warnings;

    public Scheduler(Timetable timetable, ConstraintChecker checker, List<Room> rooms, List<SpecialRequest> requests) {
        this.timetable = timetable; this.checker = checker; this.rooms = rooms; this.requests = requests; failures = new LinkedHashMap<>(); warnings = new ArrayList<>();
    }

    public void generateTimetable() {
        throw new UnsupportedOperationException("Planned feature: not implemented in Code v1.");
    }

    public Map<Session, String> getFailures() {
        return Collections.unmodifiableMap(failures);
    }

    public List<String> getWarnings() {
        return Collections.unmodifiableList(warnings);
    }
}
