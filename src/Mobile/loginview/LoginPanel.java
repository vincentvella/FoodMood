package Mobile.loginview;

import java.awt.Color;
import Mobile.mainmenuview.MainMenu;
import Mobile.userprofileview.ProfileView;

public class LoginPanel extends javax.swing.JFrame {

    /**
     * Creates new form LoginPanel
     */
    public LoginPanel() {
        initComponents();
        this.getContentPane().setBackground(Color.DARK_GRAY);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginMainRight = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();
        submitButton = new java.awt.Button();
        registerButton = new java.awt.Button();
        registerPanel = new javax.swing.JPanel();
        registerEmailLabel = new javax.swing.JLabel();
        registerEmailField = new javax.swing.JTextField();
        registerFirstNameLabel = new javax.swing.JLabel();
        registerFirstNameField = new javax.swing.JTextField();
        registerLastNameLabel = new javax.swing.JLabel();
        registerLastNameField = new javax.swing.JTextField();
        registerUsernameLabel = new javax.swing.JLabel();
        registerUsernameField = new javax.swing.JTextField();
        registerPasswordLabel = new javax.swing.JLabel();
        registerPasswordField = new javax.swing.JPasswordField();
        confirmPasswordLabel = new javax.swing.JLabel();
        confirmPasswordField = new javax.swing.JPasswordField();
        confirmButton = new java.awt.Button();
        cancelButton = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FoodMood");
        setAutoRequestFocus(false);
        setForeground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(1024, 768));
        setResizable(false);

        loginMainRight.setLayout(new java.awt.CardLayout());

        loginPanel.setBackground(new java.awt.Color(66, 69, 71));
        loginPanel.setMinimumSize(new java.awt.Dimension(0, 0));
        loginPanel.setPreferredSize(new java.awt.Dimension(512, 768));

        usernameLabel.setBackground(new java.awt.Color(204, 204, 204));
        usernameLabel.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        usernameLabel.setText("Username");
        usernameLabel.setToolTipText("");

        usernameTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        usernameTextField.setForeground(new java.awt.Color(204, 204, 204));
        usernameTextField.setToolTipText("");
        usernameTextField.setBorder(null);
        usernameTextField.setCaretColor(new java.awt.Color(69, 73, 74));
        usernameTextField.setDisabledTextColor(new java.awt.Color(69, 73, 74));
        usernameTextField.setSelectedTextColor(new java.awt.Color(69, 73, 74));
        usernameTextField.setSelectionColor(new java.awt.Color(153, 153, 153));

        passwordLabel.setBackground(new java.awt.Color(204, 204, 204));
        passwordLabel.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        passwordLabel.setText("Password");
        passwordLabel.setToolTipText("");

        passwordTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        passwordTextField.setForeground(new java.awt.Color(204, 204, 204));
        passwordTextField.setBorder(null);

        submitButton.setBackground(new java.awt.Color(127, 86, 194));
        submitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        submitButton.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setLabel("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        registerButton.setBackground(new java.awt.Color(95, 98, 100));
        registerButton.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setLabel("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usernameLabel)
                    .addComponent(passwordLabel)
                    .addComponent(registerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                    .addComponent(submitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                    .addComponent(passwordTextField)
                    .addComponent(usernameTextField))
                .addGap(27, 27, 27))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(usernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        usernameLabel.getAccessibleContext().setAccessibleName("");
        usernameLabel.setForeground(new java.awt.Color(204, 204, 204));
        usernameTextField.getAccessibleContext().setAccessibleName("");
        usernameTextField.setBackground(new java.awt.Color(69, 73, 74));
        passwordLabel.getAccessibleContext().setAccessibleName("");
        passwordLabel.setForeground(new java.awt.Color(204, 204, 204));
        passwordTextField.getAccessibleContext().setAccessibleName("");
        passwordTextField.setBackground(new java.awt.Color(69, 73, 74));

        loginMainRight.add(loginPanel, "loginPanel");
        loginPanel.getAccessibleContext().setAccessibleName("loginRightPanel");

        registerPanel.setBackground(new java.awt.Color(66, 69, 71));

        registerEmailLabel.setBackground(new java.awt.Color(204, 204, 204));
        registerEmailLabel.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        registerEmailLabel.setText("Email Address*");
        registerEmailLabel.setToolTipText("");

        registerEmailField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        registerEmailField.setForeground(new java.awt.Color(204, 204, 204));
        registerEmailField.setToolTipText("");
        registerEmailField.setBorder(null);
        registerEmailField.setCaretColor(new java.awt.Color(69, 73, 74));
        registerEmailField.setDisabledTextColor(new java.awt.Color(69, 73, 74));
        registerEmailField.setSelectedTextColor(new java.awt.Color(69, 73, 74));
        registerEmailField.setSelectionColor(new java.awt.Color(153, 153, 153));

        registerFirstNameLabel.setBackground(new java.awt.Color(204, 204, 204));
        registerFirstNameLabel.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        registerFirstNameLabel.setText("First Name*");
        registerFirstNameLabel.setToolTipText("");

        registerFirstNameField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        registerFirstNameField.setForeground(new java.awt.Color(204, 204, 204));
        registerFirstNameField.setToolTipText("");
        registerFirstNameField.setBorder(null);
        registerFirstNameField.setCaretColor(new java.awt.Color(69, 73, 74));
        registerFirstNameField.setDisabledTextColor(new java.awt.Color(69, 73, 74));
        registerFirstNameField.setSelectedTextColor(new java.awt.Color(69, 73, 74));
        registerFirstNameField.setSelectionColor(new java.awt.Color(153, 153, 153));

        registerLastNameLabel.setBackground(new java.awt.Color(204, 204, 204));
        registerLastNameLabel.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        registerLastNameLabel.setText("Last Name*");
        registerLastNameLabel.setToolTipText("");

        registerLastNameField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        registerLastNameField.setForeground(new java.awt.Color(204, 204, 204));
        registerLastNameField.setToolTipText("");
        registerLastNameField.setBorder(null);
        registerLastNameField.setCaretColor(new java.awt.Color(69, 73, 74));
        registerLastNameField.setDisabledTextColor(new java.awt.Color(69, 73, 74));
        registerLastNameField.setSelectedTextColor(new java.awt.Color(69, 73, 74));
        registerLastNameField.setSelectionColor(new java.awt.Color(153, 153, 153));

        registerUsernameLabel.setBackground(new java.awt.Color(204, 204, 204));
        registerUsernameLabel.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        registerUsernameLabel.setText("Username*");
        registerUsernameLabel.setToolTipText("");

        registerUsernameField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        registerUsernameField.setForeground(new java.awt.Color(204, 204, 204));
        registerUsernameField.setToolTipText("");
        registerUsernameField.setBorder(null);
        registerUsernameField.setCaretColor(new java.awt.Color(69, 73, 74));
        registerUsernameField.setDisabledTextColor(new java.awt.Color(69, 73, 74));
        registerUsernameField.setSelectedTextColor(new java.awt.Color(69, 73, 74));
        registerUsernameField.setSelectionColor(new java.awt.Color(153, 153, 153));

        registerPasswordLabel.setBackground(new java.awt.Color(204, 204, 204));
        registerPasswordLabel.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        registerPasswordLabel.setText("Password*");
        registerPasswordLabel.setToolTipText("");

        registerPasswordField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        registerPasswordField.setForeground(new java.awt.Color(204, 204, 204));
        registerPasswordField.setBorder(null);

        confirmPasswordLabel.setBackground(new java.awt.Color(204, 204, 204));
        confirmPasswordLabel.setFont(new java.awt.Font("Arial Narrow", 1, 24)); // NOI18N
        confirmPasswordLabel.setText("Confirm Password*");
        confirmPasswordLabel.setToolTipText("");

        confirmPasswordField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        confirmPasswordField.setForeground(new java.awt.Color(204, 204, 204));
        confirmPasswordField.setBorder(null);

        confirmButton.setActionCommand("Confirm");
        confirmButton.setBackground(new java.awt.Color(127, 86, 194));
        confirmButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        confirmButton.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        confirmButton.setForeground(new java.awt.Color(255, 255, 255));
        confirmButton.setLabel("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        cancelButton.setActionCommand("Cancel");
        cancelButton.setBackground(new java.awt.Color(95, 98, 100));
        cancelButton.setFont(new java.awt.Font("Arial Narrow", 0, 20)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setLabel("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPanelLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registerEmailLabel)
                    .addComponent(registerEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerFirstNameLabel)
                    .addComponent(registerLastNameLabel)
                    .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(registerLastNameField)
                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(registerPasswordLabel)
                            .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(confirmButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(registerUsernameField)
                                .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(confirmPasswordLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(confirmPasswordField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(registerPasswordField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(registerUsernameLabel))
                        .addComponent(registerFirstNameField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );
        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(registerEmailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registerFirstNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerFirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registerLastNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerLastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registerUsernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registerPasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(confirmPasswordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        registerEmailLabel.setForeground(new java.awt.Color(204, 204, 204));
        registerEmailField.setBackground(new java.awt.Color(69, 73, 74));
        registerFirstNameLabel.setForeground(new java.awt.Color(204, 204, 204));
        registerFirstNameField.setBackground(new java.awt.Color(69, 73, 74));
        registerLastNameLabel.setForeground(new java.awt.Color(204, 204, 204));
        registerLastNameField.setBackground(new java.awt.Color(69, 73, 74));
        registerUsernameLabel.setForeground(new java.awt.Color(204, 204, 204));
        registerUsernameField.setBackground(new java.awt.Color(69, 73, 74));
        registerPasswordLabel.setForeground(new java.awt.Color(204, 204, 204));
        registerPasswordField.setBackground(new java.awt.Color(69, 73, 74));
        confirmPasswordLabel.setForeground(new java.awt.Color(204, 204, 204));
        confirmPasswordField.setBackground(new java.awt.Color(69, 73, 74));

        loginMainRight.add(registerPanel, "registerPanel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 512, Short.MAX_VALUE)
                .addComponent(loginMainRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loginMainRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        loginPanel.setVisible(false);
        registerPanel.setVisible(true);
    }//GEN-LAST:event_registerButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        registerPanel.setVisible(false);
        loginPanel.setVisible(true);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        String[] creds = getEntries();
        Mobile.userprofilemodel.User user = Mobile.userprofilemodel.UserProfileModel.getUserForAuthentication(creds[0], creds[1]);
        if(user != null){
            registerPanel.setVisible(false);
            loginPanel.setVisible(false);
            this.setVisible(false);
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new MainMenu(Mobile.userprofilemodel.UserProfileModel.getUserProfile(user)).setVisible(true);
                }
            });
        }
        else{
            System.out.println("Invalid login");
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        String email = registerEmailField.getText();
        String firstName = registerFirstNameField.getText();
        String lastName = registerLastNameField.getText();
        String username = registerUsernameField.getText();
        String password = registerPasswordField.getText();
        Mobile.userprofilemodel.User user = Mobile.userprofilemodel.UserProfileModel.getUserForAuthentication(username, password);
        System.out.println("User created");
        if (passwordMatch() && !Mobile.userprofilemodel.UserProfileModel.getUserList().contains(username)) {
            Mobile.userprofilemodel.Profile prof = new Mobile.userprofilemodel.Profile(user, firstName, lastName, email, 0);
            System.out.println("Profile created");
            Mobile.userprofilemodel.UserProfileModel.postUser(username, password);
            System.out.println("Passwords match");
            loginPanel.setVisible(true);
            registerPanel.setVisible(false);
            
        } else if (!passwordMatch()) {
            System.out.println("Passwords do not match");
        }
        else{
            System.out.println("Invalid input/username exists");
        }
    }//GEN-LAST:event_confirmButtonActionPerformed
    
    Boolean passwordMatch(){
        if(registerPasswordField.getText().equals(confirmPasswordField.getText())){
            return true;
        } else return false;
    }
    public String[] getEntries(){
        String[] creds = new String[2];
        creds[0] = usernameTextField.getText();
        creds[1] = passwordTextField.getText();
        System.out.println(usernameTextField.getText() + " " + passwordTextField.getText());
        return creds;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button cancelButton;
    private java.awt.Button confirmButton;
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JLabel confirmPasswordLabel;
    private javax.swing.JPanel loginMainRight;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTextField;
    private java.awt.Button registerButton;
    private javax.swing.JTextField registerEmailField;
    private javax.swing.JLabel registerEmailLabel;
    private javax.swing.JTextField registerFirstNameField;
    private javax.swing.JLabel registerFirstNameLabel;
    private javax.swing.JTextField registerLastNameField;
    private javax.swing.JLabel registerLastNameLabel;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JPasswordField registerPasswordField;
    private javax.swing.JLabel registerPasswordLabel;
    private javax.swing.JTextField registerUsernameField;
    private javax.swing.JLabel registerUsernameLabel;
    private java.awt.Button submitButton;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
