package userprofilemodel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class UserProfileModel {
	
	public UserProfileModel() {
		Profile profile1 = new Profile();
		User user1 = new User();
		connectToDatabase();
		//postUser("changeThis","changePassword");
		//deleteUser("userTester");
		//putUser("changeThis","thisChanged","wow");
	}
	
	private final static String USER_FILE = "src/userprofilemodel/Users.csv";
	
	private void connectToDatabase()  {
		try {
			BufferedReader br = new BufferedReader( new FileReader(USER_FILE));
			System.out.println("Database Connection Made");
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void postUser(String user, String password) {
		try {
			try (BufferedWriter bw = new BufferedWriter( new FileWriter(USER_FILE, true))) {
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
	
	public void deleteUser(String user) {
		try {
			String record;
			File tempDB = new File("Users_temp.csv");
			File db = new File(USER_FILE);
			BufferedReader br = new BufferedReader( new FileReader(db) );
			BufferedWriter bw = new BufferedWriter( new FileWriter( tempDB ) );
			while( (record = br.readLine() ) != null ) {
				if( record.contains(user) )
					continue;
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
	
	public void putUser(String user, String newUser, String newPassword) {
		try{
			String record;
			File tempDB = new File("Users_temp.csv");
			File db = new File(USER_FILE);
			BufferedReader br = new BufferedReader( new FileReader(db) );
			BufferedWriter bw = new BufferedWriter( new FileWriter( tempDB ) );
			while((record = br.readLine()) != null ) {
				if(record.contains(user)) {
					bw.write(newUser+","+newPassword);
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
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
