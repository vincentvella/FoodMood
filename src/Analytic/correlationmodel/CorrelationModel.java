package Analytic.correlationmodel;

import Mobile.crudfoodmodel.Food;
import Mobile.crudmoodmodel.Mood;
import Mobile.crudmoodmodel.MoodModel;
import Mobile.userprofilemodel.Profile;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

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
     * Pass in a food and it will respond with an array of occurrences
     * @param food
     * @return an integer array in the same order of mood list
     */
    public static int[] getChartStats(Food food) {
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
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return occurrences;
    }
    
    /**
     * Returns a Map of occurrences of food for a specific mood
     * Pass in a Mood and you will return Food as the key and Occurrences as the Value
     * @param mood
     * @return
     */
    public static Map<String, Integer> getMoodOccurrences(Mood mood) {
        Map<String, Integer> occurrences = new HashMap<>();
        try {
            String record;
            String[] foodData;
            File db = new File(FOOD_FILE);
            try (BufferedReader br = new BufferedReader(new FileReader(db))) {
                while ((record = br.readLine()) != null) {
                    foodData = record.split(",");
                    if (foodData[3].equals(mood.getMoodName())) {
                        if (!occurrences.containsKey(foodData[1])) {
                            occurrences.put(foodData[1], 1);
                        } else if (occurrences.containsKey(foodData[1])) {
                            int f = occurrences.get(foodData[1]);
                            occurrences.put(foodData[1], f + 1);
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return occurrences;
    }
    
    /**
     * Returns a Map of occurrences of mood for a specific food
     * Pass in a Food and you will return Mood as the key and Occurrences as the Value
     * @param food
     * @return
     */
    public static Map<String, Integer> getFoodOccurrences(Food food) {
        Map<String, Integer> occurrences = new HashMap<>();
        try {
            String record;
            String[] foodData;
            File db = new File(FOOD_FILE);
            try (BufferedReader br = new BufferedReader(new FileReader(db))) {
                while ((record = br.readLine()) != null) {
                    foodData = record.split(",");
                    if (foodData[1].equals(food.getFoodName())) {
                        if (!occurrences.containsKey(foodData[3])) {
                            occurrences.put(foodData[3], 1);
                        } else if (occurrences.containsKey(foodData[3])) {
                            int f = occurrences.get(foodData[3]);
                            occurrences.put(foodData[3], f + 1);
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return occurrences;
    }
}
