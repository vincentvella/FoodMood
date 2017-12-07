package Analytic.correlationmodel;

import Mobile.crudfoodmodel.Food;
import Mobile.crudmoodmodel.Mood;
import Mobile.userprofilemodel.Profile;
import Mobile.crudmoodmodel.MoodModel;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class CorrelationModel {

        /**
     * Static Filename for Reading/Writing to CSV
     */
    private final static String FOOD_FILE = "src/Mobile/crudfoodmodel/FoodModel.csv";

    /**
     * Object instantiation
     */
    public CorrelationModel() {
        connectToDatabase();
    }

    /**
     * Checks DB Connection
     */
    private void connectToDatabase() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(FOOD_FILE));
            br.close();
            System.out.println("Database Connection Made");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Gets Occurrences Integer Array for a given food
     * @param food
     * @return 
     */
    public static int[] getOccurrences(Food food) {
        System.out.println(food.getFoodName());
        int[] occurrences = {0,0,0,0,0,0,0,0,0,0,0,0};
        ArrayList<String> moodList = MoodModel.getMoodList();
        try {
            String record;
            String[] foodData;
            File db = new File(FOOD_FILE);
            try (BufferedReader br = new BufferedReader(new FileReader(db))) {
                while ((record = br.readLine()) != null) {
                    foodData = record.split(",");
                    if (foodData[1].equals(food.getFoodName())) {
                        occurrences[moodList.indexOf(food.getFoodMood())]++;
                        System.out.println(Arrays.toString(occurrences));
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(occurrences));
        return occurrences;
    }
}
