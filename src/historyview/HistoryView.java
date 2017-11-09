package historyview;
import crudfoodmodel.Food;

public class HistoryView {
    
    public HistoryView(){
        //get saved data of created food
        System.out.println("`-History View instantiated");
        viewHistory();
    }
    
    public void viewHistory(){
        //access data/file
        System.out.println("`--History View Opened");
    }
}
