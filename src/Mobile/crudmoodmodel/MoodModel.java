package Mobile.crudmoodmodel;

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

    /**
     * Contains static filename for reading/writing Mood Files
     */
    private final static String MOOD_FILE = "src/Mobile/crudmoodmodel/MoodModel.csv";

    /**
     * Checks the DB Connection
     */
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
     * Returns the usable mood list from the DB
     *
     * @return
     */
    public static ArrayList<String> getMoodList() {
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
    
    public static String[] getMoodArray() {
        ArrayList<String> moodList = getMoodList();
        String[] moodArr = new String[moodList.size()];
        return moodList.toArray(moodArr);
    }

    /**
     * Tests the Mood classes
     *
     * @param mood
     * @return
     */
    public boolean testMoodModel(Mood mood) {
        try {
            mood.testMoodObject(mood);
            connectToDatabase();
            getMoodList();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
