package userprofilectrl;

import userprofilemodel.*;

public class UserProfileCtrl {

	public UserProfileCtrl() {
		System.out.println("`-User Profile Control Instantiated");
//		setEmail(null, null);
//		setNotifications(null, 0);
		UserProfileModel model = new UserProfileModel();
	}

	public void setEmail(User user1, String email) {
		System.out.println("`--Set User Email");
		Profile test = null;
	}

	public void setNotifications(User user1, int num) {

		Profile test = null;
	}

    public void setPassword(Profile currentProfile, String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setUsername(Profile currentProfile, String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setFirstName(Profile currentProfile, String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setLastName(Profile currentProfile, String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setEmail(Profile currentProfile, String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setNotifications(Profile currentProfile, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
