package Mobile.recommendmodel;

public class Occurance {
    private String foodName;
    private int occurances;
    
    public Occurance(String f, int o) {
        foodName = f;
        occurances = o;
    }
    
    public String getFoodName(){
        return foodName;
    }
    
    public int getOccurances() {
        return occurances;
    }
    
    public void incrementOccurance() {
        occurances++;
    }
}
