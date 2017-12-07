package Analytic.historymodel;
import Mobile.crudmoodmodel.Mood;
import Mobile.crudfoodmodel.Food;
import java.util.ArrayList;
/**
 * This class provides a basis for food related statistics
 */
public class FoodStat {
    private Food food;
    //Moods associated with the food
    private ArrayList<Mood> moods;
    
    /**
     * Default constructor for a FoodStat
     */
    public FoodStat(){
        System.out.println("`-Creates a food statistic for group of moods");
        getMoods();
    }
    
    /**
     * Gets the moods other people have associated with this food
     * @return An ArrayList of Moods detailing moods other people have felt
     * after eating this food
     */
    public ArrayList<Mood>getMoods(){
        System.out.println("  `--Returns a group of moods associated with foods");
        return moods;
    }
    
}
