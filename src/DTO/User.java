package DTO;

import java.util.List;

public class User implements IUser{

	public User(){};
	
	public User(int userID, String username, String cPR, String password, String ini, List<String> roles) {
		super();
		this.userID = userID;
		this.username = username;
		CPR = cPR;
		this.password = password;
		this.ini = ini;
		this.roles = roles;
	}

	private static final long serialVersionUID = 4545864587995944260L;
	private int	userID;                     
	private String username, CPR, password;                
	private String ini;
	private List<String> roles;
	
	
	
	@Override
	public int getUserId() {

		return userID;
	}

	@Override
	public void setUserID(int ID) {
		
		userID = ID;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}

	@Override
	public void setUsername(String name) {
		// TODO Auto-generated method stub
		username = name;
	}

	@Override
	public String getIni() {
		// TODO Auto-generated method stub
		return ini;
	}

	@Override
	public void setIni(String ini) {
		// TODO Auto-generated method stub
		this.ini = ini;
	}

	@Override
	public List<String> getRoles() {
		// TODO Auto-generated method stub
		return roles;
	}

	@Override
	public void setRoles(String roles) {
		// TODO Auto-generated method stub
		//fuckingretards
	}

	@Override
	public void addRole(String role) {
		// TODO Auto-generated method stub
		roles.add(role);
	}

	@Override
	public void setUserCpr(String Cpr) {
		// TODO Auto-generated method stub
		CPR = Cpr;
	}

	@Override
	public String getUserCpr() {
		// TODO Auto-generated method stub
		return CPR;
	}

}
