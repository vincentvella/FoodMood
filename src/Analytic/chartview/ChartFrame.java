/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analytic.chartview;

import Analytic.correlationmodel.CorrelationModel;
import java.awt.BorderLayout;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.GridPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Joe
 */
public class ChartFrame extends JFrame {

  JFXPanel fxPanel;
  private static String food;
  private int[] moodOccurrences;
  private String[] moods = new String[]{"Happy", "Sad", "Silly", "Angry", "Sick", "Disappointed", "Frustrated", "Proud", "Excited", "Scared", "Surprised", "Nervous"};
  private static PieChart pieChart;
    
  public ChartFrame(String food){
    this.food = food;
    initSwingComponents();
    initFxComponents();
  }

  private void initSwingComponents(){
    JPanel mainPanel = new JPanel(new BorderLayout());
    fxPanel = new JFXPanel();
    mainPanel.add(fxPanel, BorderLayout.CENTER);

    JLabel titleLabel = new JLabel("Charts in Swing applications");
    mainPanel.add(titleLabel, BorderLayout.NORTH);

    this.add(mainPanel);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(800,600);
  }

  private void initFxComponents(){

    Platform.runLater(new Runnable() {
        @Override
        public void run() {
            GridPane grid = new GridPane();
            Scene scene = new Scene(grid, 800, 600);

            ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList();
            moodOccurrences = CorrelationModel.getChartStats(food);
            
            for(int x = 0; x < moodOccurrences.length; x++){
                pieChartData.add(new PieChart.Data(moods[x], moodOccurrences[x]));
            }
            pieChart = new PieChart(pieChartData);
            pieChart.setTitle("Mood Correlations for " + food);

            grid.add(pieChart,1,0);
            fxPanel.setScene(scene);
          }
      });

  }

}

