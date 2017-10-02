/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chartcorrelationview;
import chartcorrelationmodel.Chart;
/**
 *
 * @author Joe
 */
public class ChartView {
    
    /**
     * Constructor for ChartView
     */
    public ChartView(Chart chart){
        System.out.println("  `--Opening Chart View");
        makeChart();
    }
    
    /**
     * Displays chart UI
     */
    public void makeChart(){
        System.out.println("  `--Presents Chart UI");
    }
}
