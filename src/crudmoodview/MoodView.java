/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudmoodview;

public class MoodView {
   
    private String mood;
    
    /**
     * This is the default constructor for the FoodMoodEntry class
     */
    public MoodView(){
        
    }
    
    /**
     * Constructor with known mood as parameter
     * @param mood Mood to be used
     */
    public MoodView(String mood){
        
    }
    
    /**
     * View allowing user to enter food consumed
     * @param mood The mood provoked from consumption
     */
    public void enterMood(String mood){
        this.mood = mood;
    }
    
    /**
     * @return  value of mood
     */
    public String getMood(){
        return mood;
    }
    
}
