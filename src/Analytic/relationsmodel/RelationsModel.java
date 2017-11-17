package Analytic.relationsmodel;
import Mobile.crudfoodmodel.Food;
import Mobile.crudmoodmodel.Mood;

public class RelationsModel {
    
    Food foodEntry;
    Mood moodEntry;
    String foodTimeEntered;
    String moodTimeEntered;
    
    public RelationsModel(){
        System.out.println("`-RelationModel instantiated.");
    }
}
