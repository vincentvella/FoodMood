package userprofilemodel;

public class Profile {

    public User user;
    public String firstName;
    public String lastName;
    public String email;
    public int notifications;

    /**
     * This is the default constructor for a profile
     *
     * @param _user
     * @param _firstName
     * @param _lastName
     * @param _email
     * @param _notifications
     */
    public Profile(User _user, String _firstName, String _lastName, String _email, int _notifications) {
        System.out.println("`-New profile instantiated.");
        user = _user;
        firstName = _firstName;
        lastName = _lastName;
        email = _email;
        notifications = _notifications;
    }

    /**
     * Sets the username
     *
     * @param username
     */
    public void setUsername(String username) {
        System.out.println("  `--Set Username");
        user.username = username;
    }

    public User getUsername(User user) {
        System.out.println("  `--Get Username");
        return this.user;
    }

    /**
     * This gets a user's stored email address
     *
     * @return The user's email
     */
    public String getEmail(String password) {
        System.out.println("  `--Get Email");
        return email;

    }

    /**
     * This sets a user's email address to a new value
     *
     * @param email The email to update with
     */
    public void setEmail(String email) {
        System.out.println("  `--Set Email");
        this.email = null;

    }

    public void setReceiveNotifications(int x) {
        System.out.println("  `--Set Receive Notificaions");
        notifications = x;
    }

    public int getReceiveNotifications(int x) {
        System.out.println("  `--Get Receive Notificaions");
        return notifications;
    }

    public String getFirstName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getLastName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getEmail() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
