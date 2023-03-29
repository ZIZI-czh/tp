package seedu.calorietracker;


import java.util.Date;
import java.util.HashMap;

import static seedu.commands.caloriecommands.AddCalorieCommand.CALORIES_NOT_GIVEN;

public class CalorieTracker {
    public static final int CALORIES_NOT_TRACKED = -1;
    private final HashMap<Date, Integer> totalCaloriesConsumedInDay;
    private final FoodList foodList;

    public CalorieTracker() {
        totalCaloriesConsumedInDay = new HashMap<>();
        foodList = new FoodList();
    }
    public CalorieTracker(FoodList foodlist) {
        totalCaloriesConsumedInDay = new HashMap<>();
        this.foodList = foodlist;
    }

    public String addCalories(Date date, String food, int calories) {
        if (calories == CALORIES_NOT_GIVEN && !foodList.contains(food)) {
            return food + " has not been added previously. Please also indicate calorie count.";
        }

        int caloriesInFood;
        if (calories == CALORIES_NOT_GIVEN) {
            caloriesInFood = foodList.getCalories(food);
        } else if (isValidCalories(calories)){
            foodList.addFood(food, calories);
            caloriesInFood = calories;
        } else {
            return "Calories count is invalid";
        }

        if (totalCaloriesConsumedInDay.containsKey(date)) {
            totalCaloriesConsumedInDay.compute(date, (key, value) -> value + caloriesInFood);
        } else {
            totalCaloriesConsumedInDay.put(date, caloriesInFood);
        }

        return "Consumed additional " + caloriesInFood + "kcal." + System.lineSeparator() +
                "Total calories consumed: " + getCalories(date) + "kcal";
    }

    public int getCalories(Date date) {
        return totalCaloriesConsumedInDay.getOrDefault(date, CALORIES_NOT_TRACKED);
    }

    private static boolean isValidCalories(int calories) {
        return calories >= 0;
    }
}
