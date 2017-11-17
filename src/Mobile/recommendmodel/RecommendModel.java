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
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RecommendModel {
    
    private final static String FOOD_FILE = "src/Mobile/crudfoodmodel/FoodModel.csv";

    public RecommendModel() {
        connectToDatabase();
    }

    private void connectToDatabase() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(FOOD_FILE));
            br.close();
            System.out.println("Database Connection Made");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private static Map<String, Integer> getOccurances(Mood mood) {
        Map<String, Integer> occurances = new HashMap<>();
        try {
            String record;
            String[] foodData;
            File db = new File(FOOD_FILE);
            try (BufferedReader br = new BufferedReader(new FileReader(db))) {
                while ((record = br.readLine()) != null) {
                    foodData = record.split(",");
                    if(!occurances.containsKey(foodData[1])){
                        occurances.put(foodData[1], 1);
                    } else if (occurances.containsKey(foodData[1])) {
                        int f = occurances.get(foodData[1]);
                        occurances.put(foodData[1], f+1);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return occurances;
    }
    
    public static ArrayList<String> getMoodAssociation(Mood mood) {
        Map<String, Integer> associations = getOccurances(mood);
        int maxValue = Collections.max(associations.values());
        ArrayList<String> result = new ArrayList<>();
        associations.entrySet().forEach((entry) -> {
            int value = entry.getValue();
            if (maxValue == value) {
                result.add(entry.getKey());
            }
        });
        System.out.println(result);
        return result;
    }
}

