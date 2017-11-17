package Mobile.historyctrl;
import Mobile.historymodel.HistoryModel;
import Mobile.historyview.HistoryView;
import Mobile.crudfoodmodel.Food;
import Mobile.crudmoodmodel.Mood;

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
