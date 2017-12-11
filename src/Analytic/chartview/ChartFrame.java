/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analytic.chartview;

import Analytic.correlationmodel.CorrelationModel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.GridPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ChartFrame extends JFrame {

    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    JFXPanel fxPanel;
    private static String food;
    private int[] moodOccurrences;
    private String[] moods = new String[]{"Happy", "Sad", "Silly", "Angry", "Sick", "Disappointed", "Frustrated", "Proud", "Excited", "Scared", "Surprised", "Nervous"};
    private PieChart pieChart;
    private JTextField textField = new JTextField(20);
    private java.awt.Button closeButton;

    public ChartFrame() {
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        initSwingComponents();
        initFxComponents();
        this.setUndecorated(true);

        //Spawns frame in center of monitor
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation((dim.width / 2 - this.getSize().width / 2) + 100, dim.height / 2 - this.getSize().height / 2);
    }

    private void initSwingComponents() {
        JPanel mainPanel = new JPanel(new BorderLayout());
        fxPanel = new JFXPanel();

        mainPanel.add(fxPanel, BorderLayout.CENTER);

        mainPanel.add(textField, BorderLayout.NORTH);
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                food = textField.getText();
                initFxComponents();
            }
        });

        closeButton = new java.awt.Button();
        closeButton.setActionCommand("Close");
        closeButton.setBackground(new java.awt.Color(127, 86, 194));
        closeButton.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        closeButton.setForeground(new java.awt.Color(255, 255, 255));
        closeButton.setLabel("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        mainPanel.add(closeButton, BorderLayout.SOUTH);
        
        this.add(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
    }

    private void closeButtonActionPerformed(ActionEvent evt) {
        dispose();
    }

    private void initFxComponents() {

        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                GridPane grid = new GridPane();
                Scene scene = new Scene(grid, 500, 500);

                ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList();
                moodOccurrences = CorrelationModel.getChartStats(food);
                System.out.println(food);
                for (int x = 0; x < moodOccurrences.length; x++) {
                    pieChartData.add(new PieChart.Data(moods[x], moodOccurrences[x]));
                }
                pieChart = new PieChart(pieChartData);
                pieChart.setTitle("Mood Correlations for " + food);

                grid.add(pieChart, 1, 0);
                fxPanel.setScene(scene);
            }
        });

    }

}
