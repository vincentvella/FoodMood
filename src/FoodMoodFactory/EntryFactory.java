package FoodMoodFactory;

public class EntryFactory {
    public Entry getEntry(String entryType){
        if(entryType == null){
            return null;
        }
        if(entryType.equalsIgnoreCase("FOOD")){
            return new Food();
        } else if (entryType.equalsIgnoreCase("MOOD")){
            return new Mood();
        }
        
        return null;
    }
}
