package statsctrl;

import statsmodel.MoodStat;
import statsmodel.FoodStat;
import statsview.StatsView;

public class StatController {
    private FoodStat foodStat;
    private MoodStat moodStat;
    
    public StatController(FoodStat food, MoodStat mood){
        updateFoodStats(food);
        updateMoodStats(mood);
        StatsView statsView = new StatsView();
    }
    
    /**
     * Updates food stats
     * @param foodstat The foodstat being added
     */
    public void updateFoodStats(FoodStat foodstat) {
        
    }
    /**
     * Updates mood stats
     * @param moodstat The moodstat being added
     */
    public void updateMoodStats(MoodStat moodstat) {
        
    }
}
