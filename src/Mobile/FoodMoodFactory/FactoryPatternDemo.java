package Mobile.FoodMoodFactory;

public class FactoryPatternDemo {
    
    public static void main(String[] args){
        EntryFactory entryFactory = new EntryFactory();

        Entry entry1 = entryFactory.getEntry("FOOD");
        entry1.create();
        
        Entry entry2 = entryFactory.getEntry("MOOD");
        entry2.create();
    }
}
