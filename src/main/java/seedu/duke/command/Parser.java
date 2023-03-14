package seedu.duke;

import java.util.ArrayList;
import java.util.Scanner;
import java.seedu.duke.command;

public class Parser {
    private static final String UNRECOGNISED_INPUT = "     ☹ OOPS!!! I'm sorry, but I don't know what that means :-(";

    /**
     * Read the input command of the users
     * @return return the string of workout
     */
    public static String readCommand(){
        String workOut;
        Scanner in = new Scanner(System.in);
        workOut = in.nextLine();
        return workOut;
    }

    public static void inputValues(String input, ArrayList<Workout> workoutInput) throws DukeException {
        String[] command = input.split("\\s+");
        switch (command[0]) {
        case "list":
            ListCommand.printList(input, workoutInput);
            break;

        default:
            throw new DukeException(UNRECOGNISED_INPUT);

        }
    }

}
