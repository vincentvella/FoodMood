package recommendmodel;
import recommendctrl.RecommendController;
import recommendview.RecommendView;
import crudfoodmodel.Food;
import crudmoodmodel.Mood;

public class RecommendModel {
    Food foodEntry;
    Mood moodEntry;
    String foodTimeEntered;
    String moodTimeEntered;
    
    public RecommendModel(){
        System.out.println("`-RecommendModel instantiated.");
    }
}
