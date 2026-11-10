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
Planned files: `data/courses.csv`, `data/instructors.txt`, `data/rooms.csv`, `data/constraints.txt`. Exact format: SRS §5. Included sample files are illustrative, not instructor-approved. Input processing is not implemented in v1. Future outputs go under `output/`; no real emails will be sent.

## Documents
- `docs/requirements/SRS-v2.pdf`
- `docs/design/SDD-v2.pdf`
- `docs/design/class-diagram.dot` and `.png`
- `docs/design/scheduling-flowchart.svg`, `.dot` and `.png`
- `docs/design/Class-Member-Inventory.md`
- `docs/checkpoints/Checkpoint-1-Report.pdf` (**evidence pending, not final**)
- `docs/team-agreement.md` (**proposed, team confirmation required**)
- `docs/releases/Code-v1-Release-Notes.md` (**draft**)
- `docs/testing/Assistant-Verification.md` (not student-run evidence)
- `docs/editable/`: editable English text sources for the PDFs

## Version status
Code v1 files are prepared. No `code-v1` Git tag, published Release, remote commit count, or student machine run is claimed by this package. Earlier v1 documents were not supplied; no historical submission dates have been created.

## Limitations / AI use
This skeleton cannot generate timetables yet. SDD describes planned functionality explicitly. ChatGPT (Codex) helped revise documents, design and generate the skeleton and run assistant-environment checks. Both students must review, understand, test and accurately declare their use before submission.
