/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analytic.chartview;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.*;
import javafx.scene.Group;
import Analytic.correlationmodel.CorrelationModel;
import Mobile.crudfoodmodel.Food;

public class PieChartSample extends Application {
 
    private Food food = new Food("Beef", "2017.11.17.02.47","Happy");
    private int[] moodOccurences = CorrelationModel.getChartStats(food);
    private String[] moods = new String[]{"Happy", "Sad", "Silly", "Angry", "Sick", "Disappointed", "Frustrated", "Proud", "Excited", "Scared", "Surprised", "Nervous"};
    
    
    @Override public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Mood Correlations");
        stage.setWidth(500);
        stage.setHeight(500);
 
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList();
        
        for(int x = 0; x < moodOccurences.length; x++){
            pieChartData.add(new PieChart.Data(moods[x], moodOccurences[x]));
        }
        final PieChart chart = new PieChart(pieChartData);
        chart.setTitle("Mood Correlations for " + food.getFoodName());

        ((Group) scene.getRoot()).getChildren().add(chart);
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}
