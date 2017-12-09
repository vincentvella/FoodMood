package Analytic.historymodel;
import Mobile.crudfoodmodel.Food;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class HistoryModel {

    /**
     * Static Filename for Reading/Writing to CSV
     */
    private final static String FOOD_FILE = "src/Mobile/crudfoodmodel/FoodModel.csv";

    /**
     * Object instantiation
     */
    public HistoryModel() {
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
     * This will return all food entries in the database for all users.
     * @return array list of foods
     */
    public static ArrayList<Food> getAllFoods() {
        ArrayList<Food> result = new ArrayList<>();
        try {
            String record;
            String[] foodData;
            File db = new File(FOOD_FILE);
            BufferedReader br = new BufferedReader(new FileReader(db));
            while ((record = br.readLine()) != null) {
                String mood = "";
                foodData = record.split(",");
                if (!foodData[3].equals("*/&%")) {
                    mood = foodData[3];
                }
                result.add(new Food(foodData[1], foodData[2], mood));
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
