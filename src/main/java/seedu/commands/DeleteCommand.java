package seedu.commands;

import seedu.ui.Ui;
import seedu.workout.Workout;

import java.util.Date;


public class DeleteCommand extends Command {
    Date workoutToDeleteDate;
    public DeleteCommand(Date workoutToDeleteDate) {
        super();
        this.workoutToDeleteDate = workoutToDeleteDate;
        setData(workoutList);

    }

    @Override
    public void execute() {
        if (workoutList == null) {
            System.out.println("WorkoutList is null.");
            return;
        }
        if(workoutList.workoutArrayList == null){
            System.out.println("the workout array list is empty");
            return;
        }
            for (Workout workout : workoutList.workoutArrayList) {
                if (workout.getDate().equals(workoutToDeleteDate)) {
                    workoutList.workoutArrayList.remove(workout);
                    System.out.println("Workout deleted successfully.");
                    Ui.showseperator();
                    return;
                }
            }
            System.out.println("No workout found with the specified date.");
        }

}

