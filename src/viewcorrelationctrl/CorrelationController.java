package viewcorrelationctrl;
import viewcorrelationview.CorrelationView;
import viewcorrelationmodel.CorrelationModel;

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
