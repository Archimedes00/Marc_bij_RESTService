package DAL;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import DTO.IUser;
import DTO.User;

public class UserService implements IUserService{

	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/cdio1";
	private String user = "root";
	private String password = "root";
	
	
	private ResultSet dbCall(String query){
		
		ResultSet rs = null;
		
		Connection con;
		try {
			con = DriverManager.getConnection(this.url, this.user, this.password);
			Statement st = (Statement) con.createStatement(); 
		    rs = st.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		return rs;
	}
	
	@Override
	public IUser getUser(int userId) {
		ResultSet rs = dbCall("SELECT * FROM personale where UserID = " + userId + "");
		
		IUser user = new User();
		
		try {
			while(rs.next()){
				
				user.setUserID(rs.getInt("UserID"));
		        user.setUserCpr(rs.getString("CPR"));
		        user.setUsername(rs.getString("name"));
		        user.setIni(rs.getString("ini"));
		        user.addRole(rs.getString("role"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
	
	@Override
	public List<IUser> getUserList() throws DALException {
		ResultSet rs = dbCall("SELECT UserID, Username, Ini, Roles, Cpr FROM personale");
		
		List<IUser> userList = new ArrayList<IUser>();
		
		try {
			while(rs.next()){
				
				User user = new User();
				user.setUserID(rs.getInt("UserID"));
		        user.setUserCpr(rs.getString("CPR"));
		        user.setUsername(rs.getString("name"));
		        user.setIni(rs.getString("ini"));
		        user.addRole(rs.getString("role"));
				
		        userList.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userList;
	}
	@Override
	public IUser createUser(IUser user) throws DALException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void updateUser(IUser user, int option) throws DALException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteUser(int userId) throws DALException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String PasswordGenerator() throws DALException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}


