package Mobile.crudmoodmodel;
import java.util.ArrayList;
/**
 * This class contains the different attributes and methods a Mood object will
 * potentially have associated with it.
 */
public class Mood {
    private String moodName;
    
    /**
     * Mood Constructor
     * @param m
     */
    public Mood(String m){
        moodName = m;
    }
    
    /**
     * Set's Mood name
     * @param n 
     */
    public void setMoodName(String n){
        moodName = n;
    }
    
    /**
     * Method to get the name of the mood object as a string
     * @return The title of the mood
     */
    public String getMoodName(){
        return moodName;
    }
    
    public boolean testMoodObject(Mood mood) {
        try {
            getMoodName();
            setMoodName("Tester");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
