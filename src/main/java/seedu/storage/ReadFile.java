
package seedu.storage;


import seedu.parser.DateFormatter;
import seedu.workout.Exercise;
import seedu.workout.Workout;
import seedu.workout.WorkoutList;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ReadFile extends Storage{


    public static void readFile(String filePath) {

        File savedFile = new File(filePath);
        if (!savedFile.getParentFile().exists()) {
            savedFile.getParentFile().mkdirs();

        }
        try {
            if (!savedFile.exists()) {
                savedFile.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("Failed to create a new file!!!");
        }

        try (BufferedReader brufferRead = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = brufferRead.readLine()) != null) {
                if(line.startsWith("Date:")) {
                    String[] storeDateList = line.split(":");
                    String storeDate = storeDateList[1].trim();
                    Date date = DateFormatter.stringToDate(storeDate);
                    Workout toStart = new Workout(date);
                    workoutList.addStorageWorkout(toStart);
                    workoutArrayList = workoutList.getWorkoutArrayList();
                    String[] exercise = storeDateList[1].split(" ");
                    if (exercise[1].trim().startsWith("Exercise:")) {
                        System.out.println("gtrt");
                        String[] storeExercise = line.split(" ");
                        String[] exerciseInfo = storeExercise[1].trim().split(":");
                        String exerciseEntery = exerciseInfo[1].trim();
                        String[] exerciseParts = exerciseEntery.split(" ");
                        String exerciseName = exerciseParts[0];
                        String weight = exerciseParts[1];
                        String repsPerSet = exerciseParts[2];
                        Exercise toAdd = new Exercise(exerciseName, weight, repsPerSet);
                        toStart.addExercise(toAdd);
                        System.out.println("exercise" + workoutExercises.size());
                    }
                }
        }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
