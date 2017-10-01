/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewcorrelationctrl;
import viewcorrelationview.CorrelationView;
import viewcorrelationmodel.CorrelationModel;

/**
 *
 * @author Joe
 */
public class CorrelationController {
    
    /**
     * Default constructor for CorrelationController objects
     */
    public CorrelationController(){
        
    }
    
    /**
     * Initializes a ChartView object
     */
    public void displayView () {
        CorrelationModel corModel = new CorrelationModel();
        CorrelationView chart = new CorrelationView(corModel);
    }
    
    
}
