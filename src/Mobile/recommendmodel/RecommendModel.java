package Mobile.recommendmodel;

import Mobile.recommendctrl.RecommendController;
import Mobile.recommendview.RecommendView;
import Mobile.crudfoodmodel.Food;
import Mobile.crudmoodmodel.Mood;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import Mobile.crudmoodmodel.Mood;
import Mobile.userprofilemodel.Profile;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RecommendModel {

    /**
     * Static Filename for Reading/Writing to CSV
     */
    private final static String FOOD_FILE = "src/Mobile/crudfoodmodel/FoodModel.csv";

    /**
     * Object instantiation
     */
    public RecommendModel() {
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
     * Returns a Map of occurrences for most popular moods for a specific user
     *
     * @param mood
     * @param prof
     * @return
     */
    private static Map<String, Integer> getOccurrences(Mood mood, Profile prof) {
        Map<String, Integer> occurrences = new HashMap<>();
        try {
            String record;
            String[] foodData;
            File db = new File(FOOD_FILE);
            try (BufferedReader br = new BufferedReader(new FileReader(db))) {
                while ((record = br.readLine()) != null) {
                    foodData = record.split(",");
                    if (foodData[3].equals(mood.getMoodName()) && foodData[0].equals(prof.user.username)) {
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
     * Gets a full list of Mood Associations
     *
     * @param mood
     * @param prof
     * @return
     */
    public static ArrayList<String> getMoodAssociation(Mood mood, Profile prof) {
        Map<String, Integer> associations = getOccurrences(mood, prof);
        ArrayList<String> result = new ArrayList<>();
        if (!associations.isEmpty()) {
            int maxValue = Collections.max(associations.values());
            associations.entrySet().forEach((entry) -> {
                int value = entry.getValue();
                if (maxValue == value) {
                    result.add(entry.getKey());
                }
            });
        }
        if (result.isEmpty()) {
            result.add("There were no results for this mood.");
        }
        return result;
    }
}
