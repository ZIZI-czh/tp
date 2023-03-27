package seedu.commands;

import seedu.ui.Ui;
import seedu.workout.Workout;

import java.util.Date;

public class ViewCommand extends Command {
    Date workoutToViewDate;
    public ViewCommand(Date workoutToViewDate) {

        this.workoutToViewDate = workoutToViewDate;
    }


    public void execute() {

            for (Workout workout : workoutList.workoutArrayList) {
                if (workout.getDate().equals(workoutToViewDate)) {
                    System.out.println(workout.getExercises());
                    Ui.showseperator();
                    return;
                }
            }

    }
}
