package Mobile.userprofilemodel;

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
     * Returns a profile user object
     *
     * @return
     */
    public User getUser() {
        return this.user;
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

    /**
     * Gets a user's username
     *
     * @return
     */
    public String getUsername() {
        System.out.println("  `--Get Username");
        return this.user.getUsername();
    }

    /**
     * Set Profile First Name
     *
     * @param name
     */
    public void setFirstName(String name) {
        System.out.println("  `--Set first name");
        firstName = name;
    }

    /**
     * get Profile First Name
     *
     * @return
     */
    public String getFirstName() {
        System.out.println("  `--Get first name");
        return this.firstName;
    }

    /**
     * Set Profile Last Name
     *
     * @param name
     */
    public void setLastName(String name) {
        System.out.println("  `--Set last name");
        lastName = name;
    }

    /**
     * Get Profile's Last Name
     *
     * @return
     */
    public String getLastName() {
        System.out.println("  `--Get last name");
        return lastName;
    }

    /**
     * This gets a user's stored email address
     *
     * @return The user's email
     */
    public String getEmail() {
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

    /**
     * Sets notification preferences for profile
     *
     * @param x
     */
    public void setReceiveNotifications(int x) {
        System.out.println("  `--Set Receive Notificaions");
        notifications = x;
    }

    /**
     * Gets profile notification preferences
     *
     * @return
     */
    public int getReceiveNotifications() {
        System.out.println("  `--Get Receive Notificaions");
        return notifications;
    }

    /**
     * Runs all profile/user tests
     *
     * @param profile
     * @return
     */
    public boolean runTests(Profile profile) {
        try {
            profile.getEmail();
            profile.getFirstName();
            profile.getLastName();
            profile.getReceiveNotifications();
            profile.getUsername();
            profile.setEmail("user@user.io");
            profile.setFirstName("Test");
            profile.setLastName("User");
            profile.setReceiveNotifications(1);
            profile.setUsername("username");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
