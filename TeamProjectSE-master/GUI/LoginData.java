package GUI;

import java.io.Serializable;

public class LoginData implements Serializable
{
	//private datafields 
	//updATE
	private String username;
	private String password;
	
	//setters for the username and password
	public void setUsername(String username)
	{
		this.username = username;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	//getters for the username and password
	public String getUsername()
	{
		return username;
	}
	public String getPassword()
	{
		return password;
	}
	
	//constructor that initializes the username and password
	public LoginData(String username, String password)
	{
		setUsername(username);
		setPassword(password);
	}
	
}
