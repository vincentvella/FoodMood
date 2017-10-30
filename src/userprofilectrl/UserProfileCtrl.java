package userprofilectrl;

import userprofilemodel.*;
import loginview.*;

public class UserProfileCtrl {
    
	public UserProfileCtrl() {
            LoginPanel loginPanel = new LoginPanel();
            System.out.println("`-User Profile Control Instantiated");
//		setEmail(null, null);
//		setNotifications(null, 0);
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
                 java.util.logging.Logger.getLogger(LoginPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
             } catch (InstantiationException ex) {
                 java.util.logging.Logger.getLogger(LoginPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
             } catch (IllegalAccessException ex) {
                 java.util.logging.Logger.getLogger(LoginPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
             } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                 java.util.logging.Logger.getLogger(LoginPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
             }

             /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                   new LoginPanel().setVisible(true);
                }
            });
                
                
	}

        public void setUsername(Profile prof, String name) {
		System.out.println("`--Set User Email");
		prof.user.setUsername(name);
	}
        
        public void setPassword(Profile prof, String pass) {
		System.out.println("`--Set User Email");
		if(prof.user.authenticate((prof.user.username), pass)){
                    prof.user.setPassword(pass);
                }
	}
        
        public void setFirstName(Profile prof, String name) {
		System.out.println("`--Set User Email");
		prof.setFirstName(name);
	}
        
        public void setLastName(Profile prof, String name) {
		System.out.println("`--Set User Email");
		prof.setLastName(name);
	}
        
	public void setEmail(Profile prof, String email) {
		System.out.println("`--Set User Email");
		prof.setEmail(email);
	}

	public void setNotifications(Profile prof, int num) {
                System.out.println("`--Set notification param");
		prof.setReceiveNotifications(num);
	}
        
        
}
