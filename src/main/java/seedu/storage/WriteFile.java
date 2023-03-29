package seedu.storage;

import seedu.calorietracker.CalorieTracker;
import seedu.parser.DateFormatter;
import seedu.workout.Workout;
import seedu.workout.WorkoutList;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class WriteFile extends Storage{

    private static final String SPACE = "          ";


    public static void writeWorkoutToFile(String filePath){
        workoutArrayList = workoutList.getWorkoutArrayList();

        try {
            File savedFile = new File(filePath);
            FileWriter writeFile = new FileWriter(savedFile);
            for(int index = 0; index < workoutArrayList.size(); index += 1) {
                writeFile.write("Date:     ");
                String formattedDate = DateFormatter.dateToString(workoutArrayList.get(index).getDate());
                writeFile.write(formattedDate + System.lineSeparator());
                //workoutExercises = workout.getExercises();
                workoutList.setCurrentStorageWorkoutIndex(index);
                workoutExercises = workoutList.getStorageCurrentWorkout().getExercises();
                if (!workoutExercises.isEmpty()) {
                    writeFile.write("Exercise: " + System.lineSeparator());
                    for (int exerciseIndex = 0; exerciseIndex < workoutExercises.size(); exerciseIndex += 1) {
                        //exerciseListString.append(i + 1).append(". " + workoutExercises.get(i).toString() + System.lineSeparator());
                        writeFile.write(SPACE + (exerciseIndex + 1) + ". " + workoutExercises.get(exerciseIndex).toString() + System.lineSeparator());
                    }
                }
            }
            writeFile.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}