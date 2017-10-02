/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package historyview;
import crudfoodmodel.Food;
/**
 *
 * @author Joe
 */
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
