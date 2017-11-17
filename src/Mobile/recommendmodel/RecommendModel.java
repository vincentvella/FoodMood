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

public class RecommendModel {

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
    
    public ArrayList<Food> getFoodsForUser(Food food) {
        ArrayList<Food> result = new ArrayList<>();
        try {
            String record;
            String[] foodData;
            File db = new File(FOOD_FILE);
            BufferedReader br = new BufferedReader(new FileReader(db));
            while ((record = br.readLine()) != null) {
                foodData = record.split(",");
                result.add(new Food(foodData[1], foodData[0], new String(foodData[2])));
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}

