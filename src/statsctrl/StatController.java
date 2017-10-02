package statsctrl;

import statsmodel.MoodStat;
import statsmodel.FoodStat;
import statsview.StatsView;

public class StatController {
    private FoodStat foodStat;
    private MoodStat moodStat;
    
    public StatController(FoodStat food, MoodStat mood){
        System.out.println("`-Stat Controller Instantiated");
        updateFoodStats(food);
        updateMoodStats(mood);
        StatsView statsView = new StatsView();
    }
    
    /**
     * Updates food stats
     * @param foodstat The foodstat being added
     */
    public void updateFoodStats(FoodStat foodstat) {
        System.out.println("  `--Updating Food Stats");
    }
    /**
     * Updates mood stats
     * @param moodstat The moodstat being added
     */
    public void updateMoodStats(MoodStat moodstat) {
        System.out.println("  `--Updating Mood Stats");
    }
}
