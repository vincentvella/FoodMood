package historyctrl;
import historymodel.HistoryModel;
import historyview.HistoryView;
import crudfoodmodel.Food;
import crudmoodmodel.Mood;

public class HistoryController {
    
    public HistoryController(){
        System.out.println("`-History Controller instantiated.");
        HistoryView historyList = new HistoryView();
        HistoryModel historyModel = new HistoryModel();
        
    }
    
    public void addHistoryEntry(Food f, Mood m){
        HistoryModel newModel = new HistoryModel();
    }
}
