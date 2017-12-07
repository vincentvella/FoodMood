package Analytic.correlationview;
import Analytic.correlationmodel.Chart;

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
