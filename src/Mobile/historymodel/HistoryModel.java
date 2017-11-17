package Mobile.historymodel;
import Mobile.crudfoodmodel.Food;
import Mobile.crudmoodmodel.Mood;

public class HistoryModel {
    
    Food foodEntry;
    Mood moodEntry;
    String foodTimeEntered;
    String moodTimeEntered;
    
    public HistoryModel(){
        System.out.println("`-History Model instantiated.");
        setFood(null);
        setFoodTime(null);
        setMood(null);
        setMoodTime(null);
        getFood();
        getFoodTime(null);
        getMood();
        getMoodTime(null);
    }
    
    public void setFood(Food example){
        System.out.println("`--Setting Food");
        this.foodEntry = example;
    }
    
    public void setFoodTime(String time){
        System.out.println("`--Setting Food Time");
        this.foodTimeEntered = time;
    }
    
    public void setMood(Mood example){
        System.out.println("`--Setting Mood");
        this.moodEntry = example;

    }
    
    public void setMoodTime(String time){
        System.out.println("`--Setting Mood Time");
        this.moodTimeEntered = time;
    }
    
    public Food getFood(){
        System.out.println("`--Get Food");
        Food eggs = null;
        return eggs;
    }
    
    public String getFoodTime(Food food){
        System.out.println("`--Get Food Time");
        return "3:00PM";
    }
    
    public Mood getMood(){
        System.out.println("`--Get Mood");
        Mood depression = null;
        return depression;
    }
    
    public String getMoodTime(Mood mood){
        System.out.println("`--Get Mood Time");
        return "3:00PM";
    }
}
