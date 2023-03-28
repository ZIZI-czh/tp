package seedu.storage;

import seedu.workout.WorkoutList;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;


public class WriteFile {

   /* public static WorkoutList workoutList = new WorkoutList();
    public static void writeWorkoutToFile(String filePath) throws IOException {

        try {
            File savedFile = new File(filePath);
            FileWriter writeFile = new FileWriter(savedFile);
            System.out.println("Date: ");
            for(Workout workout : workoutList.workoutArrayList){
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");
                String formattedDate = dateFormat.format(workout.getDate());
                writeFile.write(formattedDate);


            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }*/
}