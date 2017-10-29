package userprofilemodel;

public class User {

	public String username = "";
	public String password = "";
        public Boolean authenticated = false;

	/**
	 * This is the default constructor for the User class
	 */
	public User(String _username, String _password, Boolean _authenticated) {
            username = _username;
            password = _password;
            authenticated = _authenticated;
	}

	public void setUsername(String username) {
		System.out.println("  `--Setting Username");
		this.username = username;
	}

	public String getUsername() {
		System.out.println("  `--Getting Username");
		return username;
	}

	public void setPassword(String password) {
		System.out.println("  `--Setting Password");
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
		System.out.println(" `-Authenticate User");
		boolean auth = false;

		if (user.equals(username) && pass.equals(password)) {
			auth = true;
			System.out.println("   `-User Authenticated");
		}
		else {
			System.out.println("   `--Authentication Failed");
		}

		return auth;
	}

}
