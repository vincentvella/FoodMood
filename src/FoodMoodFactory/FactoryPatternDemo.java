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
public class FactoryPatternDemo {
    
    public static void main(String[] args){
        EntryFactory entryFactory = new EntryFactory();

        Entry entry1 = entryFactory.getEntry("FOOD");
        entry1.create();
        
        Entry entry2 = entryFactory.getEntry("MOOD");
        entry2.create();
    }
}
