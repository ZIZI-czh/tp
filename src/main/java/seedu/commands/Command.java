package seedu.commands;

import seedu.workout.WorkoutList;

public class Command {
    public WorkoutList workoutList = new WorkoutList();
    protected Command() {
    }

    public void setData(WorkoutList workoutList) {
        if (workoutList == null) {
            throw new IllegalArgumentException("WorkoutList cannot be null.");
        }
        this.workoutList = workoutList;
    }

    public void execute() {
        throw new UnsupportedOperationException("This method is to be implemented by child classes");
    }
}
