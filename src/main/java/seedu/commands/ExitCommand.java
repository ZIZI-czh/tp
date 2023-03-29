package seedu.commands;


import seedu.duke.Duke;
import seedu.storage.WriteFile;

public class ExitCommand extends Command {
    private static final String EXIT_MESSAGE = "Thank you, hope you had a great workout!!!";

    public static boolean isExit(Command command) {
        return command instanceof ExitCommand;
    }

    @Override
    public String execute() {
        WriteFile.writeWorkoutToFile(Duke.filePath);
        return EXIT_MESSAGE;
    }
}
