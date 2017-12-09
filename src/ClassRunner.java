
import Mobile.loginview.LoginPanel;
import testharness.TestHarness;

public class ClassRunner {
    static LoginPanel login = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        TestHarness.startTests();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                login = new LoginPanel();
                login.setVisible(true);
            }
        });
    }
}
