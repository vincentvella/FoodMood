package Analytic.historyctrl;

import Analytic.historyview.StatsView;

public class StatController {
    
    public StatController(){
        System.out.println("`-Stat Controller Instantiated");
        StatsView statsView = new StatsView();
    }
    
    public void updateFoodStats() {
        System.out.println("  `--Updating Food Stats");
    }

    public void updateMoodStats() {
        System.out.println("  `--Updating Mood Stats");
    }
}
