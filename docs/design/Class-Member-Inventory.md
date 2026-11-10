# Code v1 Class Member Inventory
This inventory supplements the selected-member overview in SDD v2. All declarations below exist in src/. Constructors and plain model operations work; methods throwing UnsupportedOperationException remain planned.

## TimeSlot
```java
private int day;
private int startHour;
private int duration;
public TimeSlot(int day, int startHour, int duration);
public int getDay();
public int getStartHour();
public int getDuration();
public boolean overlapsWith(TimeSlot other);
```

## Instructor
```java
private String id;
private String name;
private List<TimeSlot> unavailableSlots;
private List<TimeSlot> preferredSlots;
public Instructor(String id, String name);
public String getId();
public String getName();
public boolean isAvailable(TimeSlot slot);
public boolean prefers(TimeSlot slot);
```

## Room
```java
private String id;
private String type;
private int capacity;
private List<TimeSlot> unavailableSlots;
public Room(String id, String type, int capacity);
public String getId();
public String getType();
public int getCapacity();
public boolean isSuitableFor(Session session);
public boolean isAvailable(TimeSlot slot);
```

## Course
```java
private String code;
private String title;
private int year;
private Instructor instructor;
private int theoryHours;
private int labHours;
private int students;
public Course(String code, String title, int year, Instructor instructor, int theoryHours, int labHours, int students);
public String getCode();
public String getTitle();
public int getYear();
public Instructor getInstructor();
public int getStudents();
public List<Session> createSessions();
```

## Session
```java
private Course course;
private String type;
private int duration;
private TimeSlot assignedSlot;
private Room assignedRoom;
public Session(Course course, String type, int duration);
public String getId();
public Course getCourse();
public int getDuration();
public String getRequiredRoomType();
public boolean isAssigned();
public TimeSlot getAssignedSlot();
public Room getAssignedRoom();
public void setAssignment(TimeSlot slot, Room room);
public void clearAssignment();
```

## SpecialRequest
```java
private String sessionId;
private String requestType;
private String value;
private boolean mandatory;
public SpecialRequest(String sessionId, String requestType, String value, boolean mandatory);
public String getSessionId();
public String getRequestType();
public String getValue();
public boolean isMandatory();
```

## FileDataReader
```java
public FileDataReader();
public Map<String, Instructor> loadInstructors(String path);
public List<Course> loadCourses(String path, Map<String, Instructor> instructors);
public List<Room> loadRooms(String path);
public List<SpecialRequest> loadRequests(String path, List<Session> sessions);
```

## Timetable
```java
private List<Session> sessions;
public Timetable();
public List<Session> getSessions();
public void setSessions(List<Session> sessions);
public void assign(Session session, TimeSlot slot, Room room, ConstraintChecker checker);
public void modifyAssignment(Session session, TimeSlot slot, Room room, ConstraintChecker checker);
public void removeAssignment(Session session);
```

## ConstraintChecker
```java
private Timetable timetable;
private List<SpecialRequest> requests;
public ConstraintChecker(Timetable timetable, List<SpecialRequest> requests);
public List<String> checkHard(Session session, TimeSlot slot, Room room);
public List<String> checkSoft(Session session, TimeSlot slot, Room room);
```

## Scheduler
```java
private Timetable timetable;
private ConstraintChecker checker;
private List<Room> rooms;
private List<SpecialRequest> requests;
private Map<Session, String> failures;
private List<String> warnings;
public Scheduler(Timetable timetable, ConstraintChecker checker, List<Room> rooms, List<SpecialRequest> requests);
public void generateTimetable();
public Map<Session, String> getFailures();
public List<String> getWarnings();
```

## ClassroomRequestGen
```java
public ClassroomRequestGen();
public String generateDraft(Session session, TimeSlot suggestedSlot);
public void saveToFile(String draft, String path);
```

## ReportWriter
```java
public ReportWriter();
public String renderYear(Timetable timetable, int year);
public String renderScheduled(Timetable timetable);
public String renderProblems(Scheduler scheduler);
public void saveAll(Timetable timetable, Scheduler scheduler, String directory);
```

## Main
```java
private Scanner input;
public Main();
public static void main(String[] args);
private void printMenu();
private void handleChoice(int choice);
```