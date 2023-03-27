package seedu.commands;

import seedu.DateFormat;
import seedu.ui.Ui;
import seedu.workout.Exercise;
import seedu.workout.Workout;

import java.util.Date;
import java.util.List;

public class ViewCommand extends Command {
    Date workoutToViewDate;

    public ViewCommand(Date workoutToViewDate) {

        this.workoutToViewDate = workoutToViewDate;
    }


    public void execute() {
        DateFormat dateFormat = new DateFormat(workoutToViewDate);
        String formattedDate = dateFormat.formatDate();
        System.out.println("These are the exercise for " + formattedDate + ": ");
        for (Workout workout : workoutList.workoutArrayList) {
            if (workout.getDate().equals(formattedDate)) {
                List<Exercise> exercises = workout.getExercises();
                for (Exercise exercise : exercises) {
                    System.out.println(exercise);
                }
                Ui.showSeperator();
                return;
            }
        }

    }
}
