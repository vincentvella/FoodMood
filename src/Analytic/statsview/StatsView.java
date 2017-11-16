package Analytic.statsview;

public class StatsView {
    
    /**
     * This is the default constructor for the FoodMoodView class
     */    
    public StatsView(){
        viewStats();
        viewStatsFood(null);
        viewStatsMood(null);
    }
    
    /**
     * Allows user to view statistics concerning food and mood
     */
    public void viewStats(){
        System.out.println("`-Stat View Opened");
    }
    
    /**
     * View allowing user to view statistics concerning ONLY food
     * @param food The food the user wishes to research
     */
    public void viewStatsFood(String food){
        System.out.println("  `--Viewing Stats for Specific Food");
    }
    
    /**
     * View allowing user to view statistics concerning ONLY mood
     * @param mood The mood the user wishes to research
     */
    public void viewStatsMood(String mood){
        System.out.println("  `--Viewing Stats for Specific Mood");
    }
    
    /**
     * View allowing user to view recommended foods based on FoodMood analytics
     */
    public void viewReccomendations(){
        //does nothing right now
    }
}
