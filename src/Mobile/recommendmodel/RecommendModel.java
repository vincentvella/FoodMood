package Mobile.recommendmodel;
import Mobile.recommendctrl.RecommendController;
import Mobile.recommendview.RecommendView;
import Mobile.crudfoodmodel.Food;
import Mobile.crudmoodmodel.Mood;

public class RecommendModel {
    Food foodEntry;
    Mood moodEntry;
    String foodTimeEntered;
    String moodTimeEntered;
    
    public RecommendModel(){
        System.out.println("`-RecommendModel instantiated.");
    }
}
