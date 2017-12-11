/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analytic.chartview;

import javax.swing.SwingUtilities;

/**
 *
 * @author Joe
 */
public class ChartDemo {
    public static void main ( String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
              String food = "Beef";
              ChartFrame mainFrame = new ChartFrame(food);
              mainFrame.setVisible(true);
              }
        });
    }
}
