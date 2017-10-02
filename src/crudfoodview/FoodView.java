/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudfoodview;
import crudfoodmodel.Food;

public class FoodView {
    
    private Food food;
    private String foodName;
    
    /**
     * This is the default constructor for the FoodMoodEntry class
     */
    public FoodView(){
        
    }
    
    /**
     * Constructor with known food
     * @param food Known food object
     */
    public FoodView(Food food){
        
    }
    
    /**
     * View allowing user to enter food consumed
     * @param food The food consumed
     */
    public void enterFood(String food){
        this.foodName = food;
    }
    
    /**
     * @return value of food
     */
    public Food getFood(){
        return food;
    }
    
}
