package crudfoodmodel;

import crudmoodmodel.Mood;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FoodModel {

    public FoodModel() {
        connectToDatabase();
    }

    private final static String FOOD_FILE = "src/crudfoodmodel/FoodModel.csv";

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
     * Create Food in Records
     *(C)
     * @param mood
     */
    public void postFood(Food food) {
        try {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(FOOD_FILE, true))) {
                bw.write(food.timeEntered + "," + food.foodName + "," + food.foodMood);
                bw.flush();
                bw.newLine();
                bw.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<Food> getMoodsForUser(Mood mood) {
        ArrayList<Food> result = new ArrayList<>();
        try {
            String record;
            String[] food;
            File db = new File(FOOD_FILE);
            BufferedReader br = new BufferedReader(new FileReader(db));
            while ((record = br.readLine()) != null) {
                food = record.split(",");
                result.add(new Food(food[1], food[0], new Mood(food[2])));
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * Updates Mood for a specific record
     *(U)
     * @param mood
     * @param newMood
     */
    public void putFood(Food food, Food newFood) {
        try {
            String record;
            File tempDB = new File("Mood_temp.csv");
            File db = new File(FOOD_FILE);
            BufferedReader br = new BufferedReader(new FileReader(db));
            BufferedWriter bw = new BufferedWriter(new FileWriter(tempDB));
            while ((record = br.readLine()) != null) {
                if (record.contains(food.timeEntered) && record.contains(food.foodName)) {
                    bw.write(newFood.timeEntered + "," + newFood.foodName + "," + newFood.foodMood);
                } else {
                    bw.write(record);
                }
                bw.flush();
                bw.newLine();
            }
            br.close();
            bw.close();
            db.delete();
            tempDB.renameTo(db);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Delete Mood from records
     *(D)
     * @param mood
     */
    public void deleteFood(Food food) {
        try {
            String record;
            File tempDB = new File("Mood_temp.csv");
            File db = new File(FOOD_FILE);
            BufferedReader br = new BufferedReader(new FileReader(db));
            BufferedWriter bw = new BufferedWriter(new FileWriter(tempDB));
            while ((record = br.readLine()) != null) {
                if (record.contains(food.timeEntered) && record.contains(food.foodName)) {
                    continue;
                }
                bw.write(record);
                bw.flush();
                bw.newLine();
            }
            br.close();
            bw.close();
            db.delete();
            tempDB.renameTo(db);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

