/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodMoodFactory;

/**
 *
 * @author Ben
 */
public class EntryFactory {
    public Entry getEntry(String entryType){
        if(entryType == null){
            return null;
        }
        if(entryType.equalsIgnoreCase("FOOD")){
            return new Food();
        } else if (entryType.equalsIgnoreCase("MOOD")){
            return new Mood();
        }
        
        return null;
    }
}
