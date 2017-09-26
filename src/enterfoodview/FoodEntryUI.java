/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enterfoodview;

public class FoodEntryUI {
    
    private String food;
    
    /**
     * This is the default constructor for the FoodMoodEntry class
     */
    public FoodEntryUI(){
        
    }
    
    /**
     * View allowing user to enter food consumed
     * @param food The food consumed
     */
    public void enterFood(String food){
        this.food = food;
    }
    
    /**
     * @return value of food
     */
    public String getFood(){
        return food;
    }
    
}
