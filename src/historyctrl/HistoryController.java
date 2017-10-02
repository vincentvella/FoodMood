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
        System.out.println("`-History Controller instantiated.");
        HistoryView historyList = new HistoryView();
        HistoryModel historyModel = new HistoryModel();
        
    }
    
    public void addHistoryEntry(Food f, Mood m){
        HistoryModel newModel = new HistoryModel();
    }
}
