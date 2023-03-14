package seedu.duke;

import seedu.duke.command.Parser;

import java.util.ArrayList;

public class Duke {
    /**
     * Main entry-point for the java.duke.Duke application.
     */

    private void run() {

        boolean isRunning = true;
        while (isRunning) {
            isRunning = Parser.isByeEntered();
        }
        Parser.sayBye();
    }
    public static void main(String[] args) {

            Duke duke = new Duke();
            duke.run();

    }


}
