/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statsmodel;
import crudmoodmodel.Mood;
import crudfoodmodel.Food;
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
        
    }
    
    /**
     * Gets the moods other people have associated with this food
     * @return An ArrayList of Moods detailing moods other people have felt
     * after eating this food
     */
    public ArrayList<Mood>getMoods(){
        return moods;
    }
    
}
