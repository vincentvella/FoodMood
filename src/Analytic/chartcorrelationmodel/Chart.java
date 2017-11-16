package Analytic.chartcorrelationmodel;

public class Chart {
    
    /**
     * Default constructor for Charts
     */
    public Chart(){
        System.out.println("  `--Chart is being built");
        getData();
        populateChart();
    }
    
    /**
     * Gets data for chart
     */
    public void getData(){
        System.out.println("  `--Getting Data");
    }
    
    /**
     * Populates chart
     */
    public void populateChart(){
        System.out.println("  `--Adding Data to Chart");
    }
    
}
