/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chartcorrelationmodel;

/**
 *
 * @author Joe
 */
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
