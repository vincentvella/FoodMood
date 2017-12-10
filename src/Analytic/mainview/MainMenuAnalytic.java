/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analytic.mainview;

import Analytic.chartview.SpiderChartView;
import Analytic.correlationview.CorrelationView;
import Analytic.historyview.AnalyticsLogsView;
import Analytic.historyview.HistoryView;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Ben
 */
public class MainMenuAnalytic extends javax.swing.JFrame {

    /**
     * Creates new form MainMenuAnalytic
     */
    public MainMenuAnalytic() {
        initComponents();
        this.getContentPane().setBackground(new Color(60, 63, 65));
        this.setFocusableWindowState(false);
        
        //Spawns frame in center of monitor
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exitButton = new java.awt.Button();
        MainMenuBackground = new javax.swing.JPanel();
        viewCharts = new java.awt.Button();
        viewCorrelations = new java.awt.Button();
        viewLogs = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        exitButton.setActionCommand("Exit");
        exitButton.setBackground(new java.awt.Color(127, 86, 194));
        exitButton.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 255, 255));
        exitButton.setLabel("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        MainMenuBackground.setPreferredSize(new java.awt.Dimension(825, 750));
        MainMenuBackground.setLayout(new java.awt.CardLayout());

        viewCharts.setBackground(new java.awt.Color(95, 98, 100));
        viewCharts.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        viewCharts.setForeground(new java.awt.Color(255, 255, 255));
        viewCharts.setLabel("View Charts");
        viewCharts.setPreferredSize(new java.awt.Dimension(90, 30));
        viewCharts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewChartsActionPerformed(evt);
            }
        });

        viewCorrelations.setBackground(new java.awt.Color(95, 98, 100));
        viewCorrelations.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        viewCorrelations.setForeground(new java.awt.Color(255, 255, 255));
        viewCorrelations.setLabel("View Correlations");
        viewCorrelations.setPreferredSize(new java.awt.Dimension(90, 30));
        viewCorrelations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCorrelationsActionPerformed(evt);
            }
        });

        viewLogs.setBackground(new java.awt.Color(95, 98, 100));
        viewLogs.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        viewLogs.setForeground(new java.awt.Color(255, 255, 255));
        viewLogs.setLabel("View Logs/History");
        viewLogs.setPreferredSize(new java.awt.Dimension(90, 30));
        viewLogs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewLogsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewCharts, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(viewCorrelations, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(viewLogs, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MainMenuBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(viewCharts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewCorrelations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewLogs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(MainMenuBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE))
                .addContainerGap())
        );

        MainMenuBackground.setBackground(new java.awt.Color(66, 69, 71));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void viewChartsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewChartsActionPerformed
        new SpiderChartView().setVisible(true);
    }//GEN-LAST:event_viewChartsActionPerformed

    private void viewCorrelationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCorrelationsActionPerformed
        new CorrelationView().setVisible(true);
    }//GEN-LAST:event_viewCorrelationsActionPerformed

    private void viewLogsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewLogsActionPerformed
        //new HistoryView().setVisible(true);
        new AnalyticsLogsView().setVisible(true);
    }//GEN-LAST:event_viewLogsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenuAnalytic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuAnalytic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuAnalytic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuAnalytic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuAnalytic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainMenuBackground;
    private java.awt.Button exitButton;
    public java.awt.Button viewCharts;
    public java.awt.Button viewCorrelations;
    public java.awt.Button viewLogs;
    // End of variables declaration//GEN-END:variables
}
