/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recommendctrl;
import recommendview.RecommendView;
import recommendmodel.RecommendModel;
import crudfoodmodel.Food;
import crudmoodmodel.Mood;
/**
 *
 * @author Joe
 */
public class RecommendController {
    
    public RecommendController(){
        RecommendView recommendView = new RecommendView();
        RecommendModel recommendModel = new RecommendModel();
        System.out.println("New RecommendController instantiated.");
    }
    
    public void calculateRecommend(Food f, Mood m){
        
    }
}
