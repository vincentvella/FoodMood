/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package historymodel;
import crudfoodmodel.Food;
import crudmoodmodel.Mood;
/**
 *
 * @author Joe
 */
public class HistoryModel {
    
    Food foodEntry;
    Mood moodEntry;
    String foodTimeEntered;
    String moodTimeEntered;
    
    public HistoryModel(){
        System.out.println("HistoryModel instantiated.");
    }
    
    public void setFood(Food example){
        
        this.foodEntry = example;
    }
    
    public void setFoodTime(String time){
        
        this.foodTimeEntered = time;
    }
    
    public void setMood(Mood example){
        
        this.moodEntry = example;

    }
    
    public void setMoodTime(String time){
        
        this.moodTimeEntered = time;
    }
    
    public Food getFood(){
        
        Food eggs = null;
        return eggs;
    }
    
    public String getFoodTime(Food food){
        
        return "3:00PM";
    }
    
    public Mood getMood(){
        
        Mood depression = null;
        return depression;
    }
    
    public String getMoodTime(Mood mood){
        
        return "3:00PM";
    }
}
