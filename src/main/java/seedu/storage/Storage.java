package seedu.storage;

import seedu.workout.Exercise;
import seedu.workout.Workout;
import seedu.workout.WorkoutList;

import java.util.ArrayList;

public class Storage {

    protected static WorkoutList workoutList = new WorkoutList();
    protected static Workout workout = new Workout();
    protected static ArrayList<Workout> workoutArrayList;
    protected static ArrayList<Exercise> workoutExercises;

}
