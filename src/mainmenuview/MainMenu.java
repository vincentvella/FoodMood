package mainmenuview;

import crudfoodview.FoodView;
import crudfoodview.NewEntryView;
import javax.swing.UIManager;
import userprofileview.ProfileView;

public class MainMenu extends javax.swing.JFrame {

    userprofilemodel.Profile prof;
    /**
     * Creates new form MainMenu
     */
    public MainMenu( userprofilemodel.Profile prof) {
        this.prof = prof;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userProfileButton = new javax.swing.JButton();
        foodMoodEntryButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setResizable(false);

        userProfileButton.setText("User Profile");
        userProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userProfileButtonActionPerformed(evt);
            }
        });

        foodMoodEntryButton.setText("Food/Mood Entry");
        foodMoodEntryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodMoodEntryButtonActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(foodMoodEntryButton))
                .addContainerGap(895, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userProfileButton)
                .addGap(18, 18, 18)
                .addComponent(foodMoodEntryButton)
                .addContainerGap(657, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userProfileButtonActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfileView(prof).setVisible(true);
            }
        });
    }//GEN-LAST:event_userProfileButtonActionPerformed

    private void foodMoodEntryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodMoodEntryButtonActionPerformed
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FoodView().setVisible(true);
//            }
//        });
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewEntryView().setVisible(true);
            }
        });
    }//GEN-LAST:event_foodMoodEntryButtonActionPerformed

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
            UIManager.setLookAndFeel("com.bulenkov.darcula.DarculaLaf");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton foodMoodEntryButton;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton userProfileButton;
    // End of variables declaration//GEN-END:variables

}
