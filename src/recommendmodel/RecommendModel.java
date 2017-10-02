/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recommendmodel;
import recommendctrl.RecommendController;
import recommendview.RecommendView;
import crudfoodmodel.Food;
import crudmoodmodel.Mood;

/**
 *
 * @author Joe
 */
public class RecommendModel {
    Food foodEntry;
    Mood moodEntry;
    String foodTimeEntered;
    String moodTimeEntered;
    
    public RecommendModel(){
        System.out.println("RecommendModel instantiated.");
    }
}
