package seedu.ui;


import seedu.workout.Exercise;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Ui {
    private static final String WELCOME_MESSAGE = "Let's get moving!\n" + "\"/start <DD/MM/YY>\" to begin " +
            "your workout";
    private static final String LOGO_MESSAGE = " _______  __  .___________.________  \n" +
            "|   ____||  | |           |       /  \n" +
            "|  |__   |  | `---|  |----`---/  /   \n" +
            "|   __|  |  |     |  |       /  /    \n" +
            "|  |     |  |     |  |      /  /----.\n" +
            "|__|     |__|     |__|     /________|";
    private static final String LINE = "=======================================";
    public static final String LINE_SEPARATOR = "----------------------------------";
    private static final Scanner in = new Scanner(System.in);
    private static final String HELP_MESSAGE =
            "Here are the list of commands that you can use:" + System.lineSeparator() + LINE
                    + "- [Start a Workout: /start])" + System.lineSeparator()
                    + "- [Add exercise: /add]" + System.lineSeparator()
                    + "- [End current workout: /end]" + System.lineSeparator()
                    + "- [Display workout list: /list]" + System.lineSeparator()
                    + "- [Display a workout : /view]" + System.lineSeparator()
                    + "- [Delete a workout: /delete]" + System.lineSeparator()
                    + "- [Exit app: /exit]" + System.lineSeparator() + LINE;

    public static void showGreeting() {
        System.out.println(WELCOME_MESSAGE);
    }

    public static void showLogo(){
        System.out.println(LOGO_MESSAGE);
    }

    public static void showLine(){
        System.out.println(LINE);
    }

    public static void showSeparator(){
        System.out.println(LINE_SEPARATOR);
    }

    public static String getUserInput() {
        return in.nextLine();
    }

    public static void showWelcomeMessage() {
        showLine();
        showLogo();
        showLine();
        showGreeting();
    }

    public static String getHelpMessage() {
        return HELP_MESSAGE;
    }

    //@@ author guillaume-grn
    public static void displayCountSetsReps(ArrayList<Exercise> distinctExercisesList, Date dayInSpecificWeekDate) {
        if (distinctExercisesList.isEmpty()) {
            System.out.println("There are no workouts reported during this week !");
            return;
        }
        System.out.println("Exercises and number of sets and reps for the week of " + dayInSpecificWeekDate);
        Ui.showSeparator();
        for (Exercise exercise : distinctExercisesList) {
            System.out.println(exercise.getName() + " - " + exercise.getSetsCount() + " sets" + " - "
                    + exercise.getRepsCount() + " reps");
        }
        Ui.showSeparator();
    }

    public static void showNotFoundError() {
        System.out.println("File does not exist");
    }
}
