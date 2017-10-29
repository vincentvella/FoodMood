package userprofilectrl;

import userprofilemodel.*;

public class UserProfileCtrl {

	public UserProfileCtrl() {
		System.out.println("`-User Profile Control Instantiated");
		setEmail(null, null);
		setNotifications(null, 0);
		UserProfileModel model = new UserProfileModel();
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
