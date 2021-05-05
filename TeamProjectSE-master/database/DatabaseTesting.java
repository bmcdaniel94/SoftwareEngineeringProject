package database;

import static org.junit.Assert.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Before;
import database.*;
import org.junit.Test;

public class DatabaseTesting {
	private String[] users = {"test123", "test321","test111","test121"};
	private String[] passwords = {"123456", "654321","password","drowssap"};
	
	private Database database; 
	private int randomNum;
	
	@Before
	public void setUp() throws Exception 
	{
	  database = new Database(); 
	  randomNum = ((int)Math.random()*users.length); 
	}
	@Test
	public void testSetConnection() throws IOException, SQLException
	{
		database = new Database();

	}
	
	@Test
	public void testQuery() throws IOException, SQLException 
	{
		database = new Database();
			
			
		String username = users[randomNum]; 
		String expected = passwords[randomNum];

			
		ArrayList<String> actualList = database.query("select username, aes_decrypt(password, 'key') from user");
	 
		String getUser = actualList.get(randomNum);
		String[] actual = getUser.toString().split(",");

	 
		//compare expected with actual using assertEquals
		assertEquals("Check Query", actual[1].trim(), expected);
		
	}
	@Test
	public void testVerifyAccount() throws IOException, SQLException 
	{
		database = new Database();
		
		//Verifying that an account that has been created can be found
		database.verifyAccount("JUnitTest", "Test12");
			
		
		
	}
	@Test
	public void testCreateAccount() throws IOException, SQLException 
	{
		database = new Database();
		String username = users[randomNum]; 
		String pass = passwords[randomNum];
			
			
		database.createNewAccount(username, pass);
		
	}

}