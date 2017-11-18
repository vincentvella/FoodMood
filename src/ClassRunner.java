
import Mobile.loginview.LoginPanel;
import Mobile.userprofilectrl.UserProfileCtrl;

public class ClassRunner {
    static LoginPanel login = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        UserProfileCtrl ctrl = new UserProfileCtrl();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                login = new LoginPanel();
                login.setVisible(true);
            }
        });
    }
}
