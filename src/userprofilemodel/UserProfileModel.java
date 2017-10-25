package userprofilemodel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.ArrayList;

public class UserProfileModel {

    public UserProfileModel() {
        connectToDatabase();
        //postUser("changeThis","changePassword");
        //deleteUser("userTester");
        //putUser("changeThis","thisChanged","wow");
        //getUser("userTest");
        //getUserForAuthentication("testUser","password123");
    }

    private final static String USER_FILE = "src/userprofilemodel/UserSignIn.csv";
    private final static String USER_PROFILE = "src/userprofilemodel/UserProfile.csv";

    /**
     * Establishes and tests connection with data
     */
    private void connectToDatabase() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(USER_FILE));
            br.close();
            System.out.println("Database Connection Made");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Adds a user record to file
     * @param user
     * @param password 
     */
    public void postUser(String user, String password) {
        try {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(USER_FILE, true))) {
                System.out.println("Database Connection Made");
                bw.write(user + "," + password);
                bw.flush();
                bw.newLine();
                bw.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Delete User from records
     * @param user 
     */
    public void deleteUser(String user) {
        try {
            String record;
            File tempDB = new File("Users_temp.csv");
            File db = new File(USER_FILE);
            BufferedReader br = new BufferedReader(new FileReader(db));
            BufferedWriter bw = new BufferedWriter(new FileWriter(tempDB));
            while ((record = br.readLine()) != null) {
                if (record.contains(user)) {
                    continue;
                }
                bw.write(record);
                bw.flush();
                bw.newLine();
            }
            br.close();
            bw.close();
            db.delete();
            tempDB.renameTo(db);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Edits a user in the database
     * @param user
     * @param newUser
     * @param newPassword 
     */
    public void putUser(String user, String newUser, String newPassword) {
        try {
            String record;
            File tempDB = new File("Users_temp.csv");
            File db = new File(USER_FILE);
            BufferedReader br = new BufferedReader(new FileReader(db));
            BufferedWriter bw = new BufferedWriter(new FileWriter(tempDB));
            while ((record = br.readLine()) != null) {
                if (record.contains(user)) {
                    bw.write(newUser + "," + newPassword);
                } else {
                    bw.write(record);
                }
                bw.flush();
                bw.newLine();
            }
            br.close();
            bw.close();
            db.delete();
            tempDB.renameTo(db);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Returns the user list
     * @param user 
     */
    public ArrayList<String> getUserList() {
        ArrayList<String> userList = new ArrayList<>();
        try {
            String record;
            String username;
            String[] result;
            File db = new File(USER_FILE);
            BufferedReader br = new BufferedReader(new FileReader(db));
            while ((record = br.readLine()) != null) {
                result = record.split(",");
                username = result[0];
                userList.add(username);
            }
            br.close();
            return userList;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userList;
    }
    //returns authenticated user

    public User getUserForAuthentication(String _user, String _pass) {
        try {
            String record;
            String username;
            String password;
            String[] result;
            File db = new File(USER_FILE);
            BufferedReader br = new BufferedReader(new FileReader(db));
            while ((record = br.readLine()) != null) {
                if (record.contains(_user)) {
                    result = record.split(",");
                    username = result[0];
                    password = result[1];
                    if ((username == null ? _user == null : username.equals(_user)) && (password == null ? _pass == null : password.equals(_pass))) {
                        br.close();
                        return new User(username, password, true);
                    }
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Profile getUserProfile(User user) {
        try {
            String record;
            String firstName;
            String lastName;
            String email;
            int notifications;
            String[] result;
            Profile profile;
            File db = new File(USER_PROFILE);
            BufferedReader br = new BufferedReader(new FileReader(db));
            while ((record = br.readLine()) != null) {
                if (record.contains(user.username)) {
                    result = record.split(",");
                    firstName = result[1];
                    lastName = result[2];
                    email = result[3];
                    notifications = Integer.parseInt(result[4]);
                    br.close();
                    return new Profile(user, firstName, lastName, email, notifications);
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
