<<<<<<< HEAD
package seedu.workout;

import org.junit.jupiter.api.Test;
import seedu.DateFormat;
import seedu.workouttracker.workout.Workout;

import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorkoutTest {
    public SimpleDateFormat dateFormatting = new SimpleDateFormat("dd/MM/yyyy");

    @Test
    public void testGetDateAndSetDate() throws Exception {
        String expectedDatestring = "05/02/2023";
        Date expectedDate = dateFormatting.parse(expectedDatestring);
        Workout workout = new Workout(expectedDate);
        DateFormat dateFormat1 = new DateFormat(expectedDate);
        String formattedDate1 = dateFormat1.formatDate();
        assertEquals(formattedDate1, workout.getDate());

        String newDatestring = "06/03/2024";
        Date newDate = dateFormatting.parse(newDatestring);
        DateFormat dateFormat2 = new DateFormat(newDate);
        String formattedDate2 = dateFormat2.formatDate();
        workout.setDate(newDate);
        assertEquals(formattedDate2, workout.getDate());
    }


}

=======
package seedu.workout;

import org.junit.jupiter.api.Test;
import seedu.parser.DateFormatter;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorkoutTest {
    @Test
    public void testGetDateAndSetDate() throws Exception {
        String expectedDatestring = "05/02/2023";
        Date expectedDate = DateFormatter.stringToDate(expectedDatestring);
        Workout workout = new Workout(expectedDate);
        String formattedDate1 = DateFormatter.dateToString(expectedDate);
        assertEquals(formattedDate1, workout.getDateToString());

        String newDatestring = "06/03/2024";
        Date newDate = DateFormatter.stringToDate(newDatestring);
        String formattedDate2 = DateFormatter.dateToString(newDate);
        workout.setDate(newDate);
        assertEquals(formattedDate2, workout.getDateToString());
    }

}
>>>>>>> new-calories-branch
