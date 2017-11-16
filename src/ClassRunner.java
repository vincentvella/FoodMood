
import loginview.LoginPanel;
import userprofilectrl.UserProfileCtrl;

public class ClassRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        UserProfileCtrl ctrl = new UserProfileCtrl();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPanel().setVisible(true);
            }
        });
    }
}
