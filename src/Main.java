import java.util.*;

/** Runs the console menu, handles invalid input and exits cleanly; feature options are visibly unfinished. */
public class Main {
    private Scanner input;

    public Main() {
        input = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Main app = new Main();
        while (true) {
            app.printMenu();
            if (!app.input.hasNextLine()) { System.out.println("Input closed. Goodbye."); break; }
            String line = app.input.nextLine().trim();
            try {
                int choice = Integer.parseInt(line);
                if (choice == 0) { System.out.println("Goodbye."); break; }
                app.handleChoice(choice);
            } catch (NumberFormatException ex) {
                System.out.println("Please enter a number from the menu.");
            }
        }
    }

    private void printMenu() {
        System.out.println("\nDEPARTMENT COURSE TIMETABLE MANAGEMENT SYSTEM");
        System.out.println("Team 19 | Code v1 - Project skeleton");
        System.out.println("1. Load input data");
        System.out.println("2. Generate timetable automatically");
        System.out.println("3. View timetable by year group");
        System.out.println("4. View all scheduled sessions");
        System.out.println("5. View unscheduled sessions and warnings");
        System.out.println("6. Modify / remove an assignment");
        System.out.println("7. Generate classroom request email");
        System.out.println("8. Save timetable and reports");
        System.out.println("0. Exit");
        System.out.print("Select an option: ");
    }

    private void handleChoice(int choice) {
        if (choice >= 1 && choice <= 8) {
            System.out.println("Option " + choice + ": not implemented in Code v1.");
        } else {
            System.out.println("Unknown option. Choose 0-8.");
        }
    }
}
