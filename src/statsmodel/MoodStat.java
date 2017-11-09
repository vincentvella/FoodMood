package statsmodel;

import crudmoodmodel.Mood;
import crudfoodmodel.Food;
import java.util.ArrayList;

/**
 * This classes provides mood related statistics
 */
public class MoodStat {
    private Mood mood;
    //Moods associated with the food
    private ArrayList<Food> foods;
    
    /**
     * Default constructor for a FoodStat
     */
    public MoodStat(){
        System.out.println("`-Creates a Mood Statistic");
        getFoods();
    }
    
    /**
     * Gets the foods other people have associated with this mood
     * @return An ArrayList of Foods others have associated with this food
     */
    public ArrayList<Food>getFoods(){
        System.out.println("  `--Gets foods for mood statistic");
        return foods;
    }
    
}
