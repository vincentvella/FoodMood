package Mobile.mainmenuview;

import Mobile.crudfoodview.NewEntryView;
import Mobile.crudmoodmodel.Mood;
import Mobile.historyview.HistoryView;
import Mobile.loginview.LoginPanel;
import Mobile.userprofileview.ProfileView;
import Mobile.userprofilemodel.Profile;
import java.awt.Color;
import Mobile.recommendmodel.RecommendModel;
import Mobile.recommendview.RecommendView;
import Mobile.recommendview.RecommendView;
import Mobile.userprofilemodel.User;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Toolkit;

public class MainMenu extends javax.swing.JFrame {

    public static Profile prof;

    /**
     * Creates new form MainMenu
     */
    public MainMenu(Profile prof) {
        this.prof = prof;
        initComponents();
        RecommendModel.getMoodAssociation(new Mood("Happy"), (new Profile(new User("vvella", "pass"), "", "", "", 1)));
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

        MainMenuBackground = new javax.swing.JPanel();
        notificationButton = new javax.swing.JButton();
        userProfileButton = new java.awt.Button();
        foodMoodEntryButton = new java.awt.Button();
        viewHistoryButton = new java.awt.Button();
        logoutButton = new java.awt.Button();
        recoButton = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.lightGray);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(512, 768));
        setResizable(false);

        MainMenuBackground.setPreferredSize(new java.awt.Dimension(890, 769));

        javax.swing.GroupLayout MainMenuBackgroundLayout = new javax.swing.GroupLayout(MainMenuBackground);
        MainMenuBackground.setLayout(MainMenuBackgroundLayout);
        MainMenuBackgroundLayout.setHorizontalGroup(
            MainMenuBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 343, Short.MAX_VALUE)
        );
        MainMenuBackgroundLayout.setVerticalGroup(
            MainMenuBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        notificationButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mobile/mainmenuview/images/notification.png"))); // NOI18N
        notificationButton.setBorder(null);
        notificationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notificationButtonActionPerformed(evt);
            }
        });

        userProfileButton.setBackground(new java.awt.Color(95, 98, 100));
        userProfileButton.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        userProfileButton.setForeground(new java.awt.Color(255, 255, 255));
        userProfileButton.setLabel("User Profile");
        userProfileButton.setPreferredSize(new java.awt.Dimension(90, 30));
        userProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userProfileButtonActionPerformed(evt);
            }
        });

        foodMoodEntryButton.setBackground(new java.awt.Color(95, 98, 100));
        foodMoodEntryButton.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        foodMoodEntryButton.setForeground(new java.awt.Color(255, 255, 255));
        foodMoodEntryButton.setLabel("FoodMood Entry");
        foodMoodEntryButton.setPreferredSize(new java.awt.Dimension(123, 30));
        foodMoodEntryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodMoodEntryButtonActionPerformed(evt);
            }
        });

        viewHistoryButton.setBackground(new java.awt.Color(95, 98, 100));
        viewHistoryButton.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        viewHistoryButton.setForeground(new java.awt.Color(255, 255, 255));
        viewHistoryButton.setLabel("View Entries");
        viewHistoryButton.setPreferredSize(new java.awt.Dimension(95, 30));
        viewHistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewHistoryButtonActionPerformed(evt);
            }
        });

        logoutButton.setBackground(new java.awt.Color(127, 86, 194));
        logoutButton.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutButton.setLabel("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        recoButton.setBackground(new java.awt.Color(95, 98, 100));
        recoButton.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        recoButton.setForeground(new java.awt.Color(255, 255, 255));
        recoButton.setLabel("Recommendations");
        recoButton.setPreferredSize(new java.awt.Dimension(108, 30));
        recoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recoButtonActionPerformed(evt);
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
                            .addComponent(userProfileButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(foodMoodEntryButton, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(viewHistoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(recoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 37, Short.MAX_VALUE)
                        .addComponent(notificationButton)
                        .addGap(0, 37, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MainMenuBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(notificationButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(foodMoodEntryButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewHistoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(recoButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 492, Short.MAX_VALUE)
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(MainMenuBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE))
                .addContainerGap())
        );

        MainMenuBackground.setBackground(new java.awt.Color(66, 69, 71));
        notificationButton.setBorderPainted(false);
        notificationButton.setContentAreaFilled(false);
        notificationButton.setFocusPainted(false);
        notificationButton.setOpaque(false);
        userProfileButton.getAccessibleContext().setAccessibleName("UserProfile");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userProfileButtonActionPerformed
        new ProfileView(prof).setVisible(true);
    }//GEN-LAST:event_userProfileButtonActionPerformed

    private void foodMoodEntryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodMoodEntryButtonActionPerformed
        new NewEntryView(this).setVisible(true);
        foodMoodEntryButton.setEnabled(false);
    }//GEN-LAST:event_foodMoodEntryButtonActionPerformed

    private void notificationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notificationButtonActionPerformed

    }//GEN-LAST:event_notificationButtonActionPerformed

    private void viewHistoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewHistoryButtonActionPerformed
        new HistoryView(prof).setVisible(true);
    }//GEN-LAST:event_viewHistoryButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        dispose();
        new LoginPanel().setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void recoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recoButtonActionPerformed
        new RecommendView().setVisible(true);
    }//GEN-LAST:event_recoButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

    }
    
    public void notificationEnable(){
        notificationButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mobile/mainmenuview/images/notification_green.png")));
    }
    
    public void notificationDisable(){
        notificationButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mobile/mainmenuview/images/notification.png")));
    }
    
    public void buttonEnable(Button button){
        button.setEnabled(true);
        repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainMenuBackground;
    public java.awt.Button foodMoodEntryButton;
    private java.awt.Button logoutButton;
    private javax.swing.JButton notificationButton;
    public java.awt.Button recoButton;
    public java.awt.Button userProfileButton;
    public java.awt.Button viewHistoryButton;
    // End of variables declaration//GEN-END:variables


}
