package Mobile.crudmoodmodel;

import Mobile.crudfoodmodel.Food;
import Mobile.userprofilemodel.Profile;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MoodModel {

    public MoodModel() {
        connectToDatabase();
    }

    private final static String MOOD_FILE = "src/Mobile/crudmoodmodel/MoodModel.csv";

    private void connectToDatabase() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(MOOD_FILE));
            br.close();
            System.out.println("Database Connection Made");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
        /**
     * Gets mood list
     * @param mood
     * @return 
     */
    public ArrayList<String> getMoodList() {
     ArrayList<String> moodList = new ArrayList<>();
     try {
         String record;
         String moodName;
         String[] result;
         File db = new File(MOOD_FILE);
         BufferedReader br = new BufferedReader(new FileReader(db));
         while ((record = br.readLine()) != null) {
             result = record.split(",");
             moodName = result[0];
             moodList.add(moodName);
         }
         br.close();
         return moodList;
     } catch (IOException e) {
         e.printStackTrace();
     }
     return null;
    }

    public boolean testMoodModel() {
        try {
            connectToDatabase();
            getMoodList();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
