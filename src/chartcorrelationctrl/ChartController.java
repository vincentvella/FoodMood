package chartcorrelationctrl;
import chartcorrelationmodel.Chart;
import chartcorrelationview.ChartView;

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
