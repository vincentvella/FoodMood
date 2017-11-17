package Mobile.crudfoodmodel;

import Mobile.crudmoodmodel.Mood;
import Mobile.userprofilemodel.Profile;
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

    private final static String FOOD_FILE = "src/Mobile/crudfoodmodel/FoodModel.csv";

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
     * @param food
     */
    public void postFood(Profile profile, Food food) {
        try {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(FOOD_FILE, true))) {
                bw.write(profile.user.username + "," + food.getFoodName() + "," + food.getTimeEntered() + "," + food.getFoodMood());
                bw.flush();
                bw.newLine();
                bw.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<Food> getFoodsForUser(String username) {
        
        ArrayList<Food> result = new ArrayList<>();
        try {
            String record;
            String[] foodData;
            File db = new File(FOOD_FILE);
            BufferedReader br = new BufferedReader(new FileReader(db));
            while ((record = br.readLine()) != null) {
                foodData = record.split(",");
                
                if(foodData[0].equals(username)){
                result.add(new Food(foodData[1], foodData[2], foodData[3]));
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * Updates Food for a specific record
     *(U)
     * @param food
     * @param newFood
     */
    public void putFood(Food food, Food newFood ) {
        try {
            String record;
            File tempDB = new File("Food_temp.csv");
            File db = new File(FOOD_FILE);
            BufferedReader br = new BufferedReader(new FileReader(db));
            BufferedWriter bw = new BufferedWriter(new FileWriter(tempDB));
            while ((record = br.readLine()) != null) {
                if (record.contains(food.getTimeEntered()) && record.contains(food.getFoodName())) {
                    bw.write(newFood.getTimeEntered() + "," + newFood.getFoodName() + "," + newFood.getFoodName());
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
     * Delete Food from records
     *(D)
     * @param food
     */
    public void deleteFood(Food food) {
        try {
            String record;
            File tempDB = new File("Food_temp.csv");
            File db = new File(FOOD_FILE);
            BufferedReader br = new BufferedReader(new FileReader(db));
            BufferedWriter bw = new BufferedWriter(new FileWriter(tempDB));
            while ((record = br.readLine()) != null) {
                if (record.contains(food.getTimeEntered()) && record.contains(food.getFoodName())) {
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

