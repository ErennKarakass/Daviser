# Department Course Timetable Management System

A Java-based application designed for the Department Course Timetable Coordinator to automatically generate weekly course timetables, detect scheduling conflicts, manage classroom capacities, and draft formal classroom request emails for unscheduled sessions.

## Team Information

| Name Surname | GitHub Username | Role | 
| ----- | ----- | ----- | 
| Eren KARAKAŞ | [@ErennKarakass](https://github.com/ErennKarakass) | Team Member | 
| Semih Mertcan İÇYER | [@semihicyer](https://github.com/semihicyer) | Team Member | 

## Repository URL

`https://github.com/ErennKarakass/Daviser.git`

## Technical Requirements

* **Java Development Kit (JDK):** Version 21 or 25 (LTS)

* **External Libraries:** None (Standard Java Standard Edition SDK only)

* **Execution Environment:** Command Line / Terminal or IDE (IntelliJ IDEA / Eclipse)

## How to Compile and Run

Execute the following commands from the repository root folder:

### 1. Compile the Java Source Code

```
javac -d out src/*.java

```

### 2. Run the Application

```
java -cp out Main

```

## Input Data Files Structure

The application consumes input datasets located in the `data/` folder:

| File Path | Format | Content & Description | 
| ----- | ----- | ----- | 
| `data/courses.csv` | CSV | Course catalog, year groups (1-4), theory/lab hours, student counts | 
| `data/instructors.txt` | TXT | Instructor profiles, unavailable time slots, and teaching preferences | 
| `data/rooms.csv` | CSV | Classroom and laboratory capacities, room types, and unavailable slots | 
| `data/constraints.txt` | TXT | Special scheduling requests and predefined fixed-time constraints | 

*Note: Detailed field formats and data validation rules are specified in Section 5 of the SRS document.*

## Using the Application Menu

When started, the application presents the main interactive console menu (Screen 1):

| Option | Functional Description | SRS Requirement | 
| ----- | ----- | ----- | 
| **1** | Load input data from files (CSV/TXT) | FR-01 to FR-05 | 
| **2** | Generate weekly timetable automatically using rule-based scheduling | FR-06 to FR-10 | 
| **3** | View weekly timetable grid by year group (Years 1 to 4) | FR-11 | 
| **4** | View list of all scheduled sessions | FR-12 | 
| **5** | View unscheduled sessions and soft-constraint warnings | FR-13, FR-14 | 
| **6** | Modify or remove an assignment (re-evaluating hard constraints) | FR-15 to FR-17 | 
| **7** | Generate formal classroom request email draft (for NO ROOM sessions) | FR-18 to FR-20 | 
| **8** | Save timetable grids and scheduling reports to disk | FR-21 | 
| **0** | Exit application | NFR-02 | 

## Output Files

Generated timetables and summary reports are automatically exported to the `output/` directory:

* `output/timetable_year[N].txt`: Formatted 5-day × 8-slot weekly grids for each year group.

* `output/scheduled_sessions.txt`: Master list of all successfully assigned blocks.

* `output/unscheduled_report.txt`: Unscheduled sessions with failure reasons (NO ROOM vs CONSTRAINT).

* `output/classroom_request_[CODE].txt`: Formal email draft to Student Affairs Office requesting extra room capacity.

## Repository Structure

```
department-timetable/
├── docs/
│   ├── requirements/    # SRS documents (SRS-v1.pdf, SRS-v2.pdf, SRS-final.pdf)
│   ├── design/          # SDD documents (SDD-v1.pdf, SDD-v2.pdf, SDD-final.pdf)
│   ├── testing/         # Manual test result reports (Test-Results.pdf)
│   └── checkpoints/     # Milestone checkpoint reports (Checkpoint-1-Report.pdf)
├── data/                # Input dataset files (courses.csv, instructors.txt, rooms.csv, constraints.txt)
├── src/                 # Java source code (.java files matching SDD v2 class diagram)
├── output/              # Exported timetables, reports, and generated email drafts
└── README.md            # System documentation and execution guide

```

## SCM & Version Release History

| Version | Git Tag | Date | Release Summary | 
| ----- | ----- | ----- | ----- | 
| **Code v1** | `code-v1` | 10.11.2026 | Java skeleton matching SDD v2 class diagram, Main console menu, Checkpoint 1 submission (Team 19). | 
| **Code v2** | `code-v2` | *\[Week 8\]* | Input file parsing (`FileDataReader`) and object model validation. | 
| **Code v3** | `code-v3` | *\[Week 9\]* | Core rule-based scheduling algorithm and conflict detection implementation. | 
| **Code v4** | `code-v4` | *\[Week 10\]* | Core working timetable generator and grid viewer (Checkpoint 2 submission). | 
| **Code v5** | `code-v5` | *\[Week 11\]* | Soft constraints, special requests, and manual schedule modification module. | 
| **Code v6** | `code-v6` | *\[Week 12\]* | Output file exporter, classroom request email generator, manual test log. | 
| **Final** | `final` | *\[Week 13\]* | Completed application, final documents, and Checkpoint 3 release. | 

## Known Limitations

* The rule-based scheduling algorithm uses a greedy heuristic without exhaustive backtracking. In cases of extreme room capacity bottlenecks, certain sessions may remain unscheduled even if a mathematical solution theoretically exists.

* Automatic email dispatch is out of scope; the system generates formatted text drafts in `output/`.

## Documentation References

* **Software Requirements Specification (SRS):** `docs/requirements/SRS-v2.pdf`

* **Software Design Document (SDD):** `docs/design/SDD-v2.pdf`

* **Checkpoint 1 Report:** `docs/checkpoints/Checkpoint-1-Report.pdf`