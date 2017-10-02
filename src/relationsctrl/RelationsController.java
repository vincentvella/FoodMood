/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationsctrl;
import relationsview.RelationsView;
import relationsmodel.RelationsModel;
import crudfoodmodel.Food;
import crudmoodmodel.Mood;
/**
 * 
 *
 * @author 
 */
public class RelationsController {
    
    public RelationsController(){
        RelationsView relationsView = new RelationsView();
        RelationsModel relationsModel = new RelationsModel();
        System.out.println("New RelationsController instantiated.");
    }
    
    public void addRelationsEntry(Food f, Mood m){
        
    }
}
