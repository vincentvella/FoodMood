/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package historyctrl;
import historymodel.HistoryModel;
import historyview.HistoryView;
import crudfoodmodel.Food;
import crudmoodmodel.Mood;
/**
 *
 * @author Joe
 */
public class HistoryController {
    
    public HistoryController(){
        HistoryView historyList = new HistoryView();
        System.out.println("New HistoryController instantiated.");
    }
    
    public void addHistoryEntry(Food f, Mood m){
        
        HistoryModel newModel = new HistoryModel();
        newModel.setFood(f);
        newModel.setMood(m);
    }
}
