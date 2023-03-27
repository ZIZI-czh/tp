package seedu.duke;

import seedu.commands.Command;
import seedu.commands.ExitCommand;
import seedu.parser.Parser;
import seedu.storage.ReadFile;
import seedu.ui.Ui;
import seedu.workout.WorkoutList;


public class Duke {

    private Ui ui;
    private WorkoutList workoutList;

    private static final String filePath = "data/exerciseRecording.txt";

    public Duke(String filePath) {

        try {
            ReadFile.readFile(filePath);
        } catch (java.io.FileNotFoundException e) {
            Ui.showNotFoundError();
        }
    }

    private void run() {
        ui = new Ui();
        workoutList = new WorkoutList();
        Ui.showLine();
        Ui.showLogo();
        Ui.showLine();
        Ui.showGreeting();

        executeCommandUntilExit();
        Ui.showExit();
    }

    private void executeCommandUntilExit() {
        Command command;
        do {
            String userInput = ui.getUserInput();
            command = new Parser().processCommand(userInput);
            try {
                command.setData(workoutList);
                command.execute();
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                // handle the exception in the appropriate way for your application
            }
        } while (!ExitCommand.isExit(command));
    }

    public static void main(String[] args) {
        new Duke(filePath).run();
    }
}
