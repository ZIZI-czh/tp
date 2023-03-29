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
        workoutExercises = workout.getExercises();
        System.out.println("workarr : " + workoutArrayList.size());
        System.out.println("workExer : " + workoutExercises.size());

        try {
            File savedFile = new File(filePath);
            FileWriter writeFile = new FileWriter(savedFile);
            writeFile.write("Date:     ");
            for(Workout workout : workoutArrayList){
                String formattedDate = DateFormatter.dateToString(workout.getDate());
                writeFile.write(formattedDate);
                writeFile.write("Exercise: ");
                for (int i = 0; i < workoutExercises.size(); i += 1) {
                    //exerciseListString.append(i + 1).append(". " + workoutExercises.get(i).toString() + System.lineSeparator());
                    writeFile.write(SPACE + i+1 + ". " + workoutExercises.get(i).toString() + System.lineSeparator());
                }
            }
            writeFile.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}