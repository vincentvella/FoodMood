/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmoodmodel;

import enterfoodmoodmodel.*;
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
        
    }
    
    /**
     * Gets the foods other people have associated with this mood
     * @return An ArrayList of Foods others have associated with this food
     */
    public ArrayList<Food>getFoods(){
        return foods;
    }
    
}
