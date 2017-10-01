package statsctrl;

import statsmodel.MoodStat;
import statsmodel.FoodStat;

public class StatController {
    private FoodStat foodStat;
    private MoodStat moodStat;
    
    public FoodStat updateFoodStats(FoodStat foodstat) {
        return foodStat;
    }
    
    public MoodStat updateMoodStats(MoodStat moodstat) {
        return moodStat;
    }
}
