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
        displayView();
    }
    
    /**
     * Initializes a ChartView object
     */
    public void displayView () {
        System.out.println("`-Instantiating Chart");
        Chart chart = new Chart();
        System.out.printf("`-Chart Instantiated\n`-Building Chart UI\n");
        ChartView chartUI = new ChartView(chart);
    }
}
