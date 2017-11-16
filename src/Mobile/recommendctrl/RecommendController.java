package Mobile.recommendctrl;
import Mobile.recommendview.RecommendView;
import Mobile.recommendmodel.RecommendModel;
import Mobile.crudfoodmodel.Food;
import Mobile.crudmoodmodel.Mood;

public class RecommendController {
    
    public RecommendController(){
        RecommendView recommendView = new RecommendView();
        RecommendModel recommendModel = new RecommendModel();
        System.out.println("`-Recommend Controller instantiated.");
        calculateRecommend(null, null);
    }
    
    public void calculateRecommend(Food f, Mood m){
        System.out.println("  `--Recommendations Calculated");
    }
}
