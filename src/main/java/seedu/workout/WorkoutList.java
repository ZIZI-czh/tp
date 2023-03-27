package seedu.workout;

import seedu.ui.Ui;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;


public class WorkoutList {
    public static final int NO_CURRENT_WORKOUT = -1;
    public ArrayList<Workout> workoutArrayList;
    public int currentWorkoutIndex;

    public WorkoutList() {
        workoutArrayList = new ArrayList<>();
        currentWorkoutIndex = NO_CURRENT_WORKOUT;
    }

    public void addWorkout(Workout workout) {
        workoutArrayList.add(workout);
        currentWorkoutIndex = getLastIndex();
    }

    public void setCurrentWorkoutIndex(int currentWorkoutIndex) {
        this.currentWorkoutIndex = currentWorkoutIndex;
    }

    public int getLastIndex() {
        return workoutArrayList.size() - 1;
    }

    public Workout getCurrentWorkout() {
        return workoutArrayList.get(currentWorkoutIndex);
    }
}
