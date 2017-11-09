package relationsmodel;
import crudfoodmodel.Food;
import crudmoodmodel.Mood;

public class RelationsModel {
    
    Food foodEntry;
    Mood moodEntry;
    String foodTimeEntered;
    String moodTimeEntered;
    
    public RelationsModel(){
        System.out.println("`-RelationModel instantiated.");
    }
}
