/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationsmodel;
import crudfoodmodel.Food;
import crudmoodmodel.Mood;
/**
 *
 * @author Joe
 */
public class RelationsModel {
    
    Food foodEntry;
    Mood moodEntry;
    String foodTimeEntered;
    String moodTimeEntered;
    
    public RelationsModel(){
        System.out.println("RelationModel instantiated.");
    }
}
