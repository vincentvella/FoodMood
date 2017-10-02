/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chartcorrelationctrl;
import chartcorrelationmodel.Chart;
import chartcorrelationview.ChartView;
/**
 *
 * @author Joe
 */
public class ChartController {
    
    /**
     * Constructor for ChartController object
     */
    public ChartController(){
        
    }
    
    /**
     * Initializes a ChartView object
     */
    public void displayView () {
        Chart chart = new Chart();
        ChartView chartUI = new ChartView(chart);
    }
    
    
}
