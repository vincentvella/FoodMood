package Mobile.userprofilemodel;

public class User {

	public String username = "";
	public String password = "";
        public Boolean authenticated = false;

        
	/**
	 * This is the default constructor for the User class
	 */
	public User(String _username, String _password) {
            username = _username;
            password = _password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * This authenticates a user's log in information
	 *
	 * @param user The username to authenticate
	 * @param pass The password to authenticate
	 * @return The boolean result from authenticate, true is authenticated
	 */
	public boolean authenticate(String user, String pass) {
		boolean auth = false;

		if (user.equals(username) && pass.equals(password)) {
			auth = true;
		}
		else {
			System.out.println("Authentication Failed");
		}

		return auth;
	}

}
