package Mobile.recommendmodel;

import Mobile.crudmoodmodel.Mood;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Suggestion {
    private Occurance mostCommonFood;
    private Occurance leastCommonFood;
    private ArrayList<Occurance> occurances;
    
    private final static String FOOD_FILE = "src/Mobile/crudfoodmodel/FoodModel.csv";
    
    public Suggestion() {
        
    }
    
    public void getOccurances() {
        
    }
    
    public boolean occuranceExists(ArrayList<Occurance> o, String d) {
        for(int i = 0; i < o.size(); i++){
            if(o.get(i).getFoodName() == d){
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Occurance> getOccurances(Mood mood) {
        ArrayList<Occurance> result = new ArrayList<>();
        try {
            String record;
            String[] foodData;
            File db = new File(FOOD_FILE);
            BufferedReader br = new BufferedReader(new FileReader(db));
            while ((record = br.readLine()) != null) {
                foodData = record.split(",");
                if(result.size() == 0 && (foodData[3].equals(mood.getMoodName()))) {
                    result.add(new Occurance(foodData[1], 1));
                } else if (result.size() < 0 && (foodData[3].equals(mood.getMoodName())) && !occuranceExists(result, foodData[3])) {
                    result.add(new Occurance(foodData[1], 1));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
    
}
