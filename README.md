# Department Course Timetable Management System

SENG 271 Team 19: a Java console project for automatically creating department weekly timetables. **Current stage: Code v1 skeleton, not a working scheduler.**

## Team
| Name | GitHub |
| --- | --- |
| Eren KARAKAŞ | @ErennKarakass |
| Semih Mertcan İÇYER | @semihicyer |

## Requirements
JDK 21 (proposed common baseline) or JDK 25. Both members must use the same major version. No external Java libraries.

## Run in IntelliJ
Open this folder; set the Project SDK to the agreed JDK. Mark `src` as Sources Root. Open `src/Main.java` and click the green Run triangle by `main`. Try `1`, `abc`, `99`, then `0`.

## Compile and run from the repository root
```bash
javac -d out src/*.java
java -cp out Main
```
The instructor also requests a terminal run by each member. No IDE files are needed in Git.

## Current behavior
The full menu appears. Options 1-8 clearly say they are not implemented. Invalid text and out-of-range choices are rejected; 0 exits. EOF exits cleanly. Constructors/accessors, session creation and TimeSlot bounds/overlap are available. All loading, scheduling, checking, reporting and manual editing methods that remain unfinished throw `UnsupportedOperationException` if called directly; the menu does not call them.

## Planned menu
| Option | Feature |
| --- | --- |
| 1 | Load data |
| 2 | Generate timetable |
| 3 | View year timetable |
| 4 | View all scheduled sessions |
| 5 | View unassigned sessions / warnings |
| 6 | Modify or remove assignment |
| 7 | Generate and save room-request draft |
| 8 | Save timetables/reports |
| 0 | Exit (implemented) |

## Input / output

Planned input files:
- data/courses.csv
- data/instructors.txt
- data/rooms.csv
- data/constraints.txt

The planned formats are described in SRS Section 5.
Input processing is not implemented in Code v1.
Future output files will be stored under output/.
Room-request messages will be saved as text drafts.

## Documents

- [SRS v2](docs/requirements/SRS-v2.pdf)
- [SDD v2](docs/design/SDD-v2.pdf)
- [Class diagram](docs/design/class-diagram.png)
- [Scheduling flowchart](docs/design/scheduling-flowchart.png)
- [Class member inventory](docs/design/Class-Member-Inventory.md)
- [Team agreement](docs/team-agreement.md)
- [Checkpoint 1 report](Checkpoint-1-Report.pdf)

## Version status

The Code v1 Java skeleton, SRS v2, SDD v2 and README
have been uploaded to the repository.
Both team members have commits in the repository.

Semih ran Main in IntelliJ IDEA using JDK 21 on macOS.
The menu appeared, option 1 displayed the expected
not-implemented message, invalid input was rejected,
and option 0 exited with "Goodbye."

Eren's local run and terminal runs by both members
remain to be verified.
The code-v1 tag and GitHub release are pending.

## Limitations

Code v1 provides the class structure and a runnable menu.
Options 1–8 are not implemented yet.
Automatic scheduling, input processing, conflict checking,
manual editing and report generation are planned features.

## AI use

ChatGPT (Codex) assisted with document revision, design,
Java skeleton generation and checks in the assistant
environment. These checks are separate from student
testing. Both team members are responsible for reviewing,
understanding and validating the submitted work.
