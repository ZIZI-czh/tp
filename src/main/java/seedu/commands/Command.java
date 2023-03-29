package seedu.commands;


import seedu.calorietracker.CalorieTracker;
import seedu.duke.Duke;
import seedu.workout.Workout;
import seedu.workout.WorkoutList;

import java.io.IOException;
import java.util.ArrayList;

public class Command{

    protected static WorkoutList workoutList = new WorkoutList();
    //protected static WorkoutList workoutList;
    protected CalorieTracker calorieTracker;
    protected static ArrayList<Workout> workoutArrayList;

    public void setData(WorkoutList workoutList, CalorieTracker calorieTracker) throws IllegalArgumentException{
        if (workoutList == null || calorieTracker == null) {
            throw new IllegalArgumentException("WorkoutList cannot be null.");
        }

        //this.workoutList = workoutList;
        this.calorieTracker = calorieTracker;
    }

    public String execute() {
        throw new UnsupportedOperationException("This method is to be implemented by child classes");
    }
}

