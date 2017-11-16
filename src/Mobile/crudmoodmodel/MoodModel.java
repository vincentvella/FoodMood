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
     * Create Mood in Records
     *(C)
     * @param mood
     */
    public void postMood(Mood mood) {
        try {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(MOOD_FILE, true))) {
                bw.write(mood.getMoodName()+",");
                bw.flush();
                bw.newLine();
                bw.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    //public void getMood(Mood mood) {
    // TODO Create read methods if necessary   
    //}
    
    /**
     * Gets mood list for user in submissions
     * @param mood
     * @return 
     */
    public ArrayList<String> getMoodsForUser(Mood mood) {
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

    /**
     * Updates Mood for a specific record
     *(U)
     * @param mood
     * @param newMood
     */
    public void putMood(Mood mood, Mood newMood) {
        try {
            String record;
            File tempDB = new File("Mood_temp.csv");
            File db = new File(MOOD_FILE);
            BufferedReader br = new BufferedReader(new FileReader(db));
            BufferedWriter bw = new BufferedWriter(new FileWriter(tempDB));
            while ((record = br.readLine()) != null) {
                if (record.contains(mood.getMoodName())) {
                    bw.write(newMood.getMoodName());
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
    public void deleteMood(Mood mood) {
        try {
            String record;
            File tempDB = new File("Mood_temp.csv");
            File db = new File(MOOD_FILE);
            BufferedReader br = new BufferedReader(new FileReader(db));
            BufferedWriter bw = new BufferedWriter(new FileWriter(tempDB));
            while ((record = br.readLine()) != null) {
                if (record.contains(mood.getMoodName())) {
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
