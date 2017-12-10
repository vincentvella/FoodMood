/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analytic.historyview;

import Mobile.crudfoodmodel.Food;
import Analytic.historymodel.HistoryModel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ben
 */
public class AnalyticsLogsView extends javax.swing.JFrame {

    private java.awt.Button closeButton;
    private javax.swing.JScrollPane scroll;
    private JTable AnalyticsHistoryTable;

    /**
     * Creates new form HistoryView
     */
    public AnalyticsLogsView() {
        this.setUndecorated(true);
        initComponents();
        this.getContentPane().setBackground(new Color(60, 63, 65));
        
        //Spawns frame in center of monitor
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation( (dim.width/2-this.getSize().width/2) + 100, dim.height/2-this.getSize().height/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {       
        
        String[] columns = {"Food Name", "Associated Mood", "Time Entered"};
        Object[][] data = getTableData();
        AnalyticsHistoryTable = new JTable(data, columns);
        
        scroll = new javax.swing.JScrollPane(AnalyticsHistoryTable);
        scroll.setViewportView(AnalyticsHistoryTable);
        
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

        // <editor-fold defaultstate="collapsed" desc="pack code"> 
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(688, Short.MAX_VALUE)
                                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
                                        .addContainerGap()))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(711, Short.MAX_VALUE)
                                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(46, Short.MAX_VALUE)))
        );

        pack();//</editor-fold>
    }// </editor-fold>                        

    private Object[][] getTableData() {
        HistoryModel hm = new HistoryModel();

        ArrayList<Food> foods = hm.getAllFoods();
        Object[][] data;
        data = new Object[foods.size()][3];

        //populate data array with food information
        for (int i = 0; i < foods.size(); i++) {
            data[i][0] = foods.get(i).getFoodName();
            data[i][1] = foods.get(i).getFoodMood();
            data[i][2] = foods.get(i).getTimeEntered();
        }

        return data;
    }

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

    }
}
