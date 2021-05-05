package GUI;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;
import clientSubSystem.CreateAccountControl;

public class CreateAccountPanel extends JPanel 
{
	//private datafields
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JPasswordField passwordVerifyField;
	private JLabel errorLabel;
	
	//getter for username field text
	public String getUsername()
	{
		return usernameField.getText();
	}
	
	//getter for password field text
	public String getPassword()
	{
		return new String(passwordField.getPassword());
	}
	
	//getter for verify password field text
	public String getPasswordVerify()
	{
		return new String(passwordVerifyField.getPassword());
	}
	
	//setter for error text
	public void setError(String error)
	{
		errorLabel.setText(error);
	}
	
	//constructor for create account panel
	public CreateAccountPanel(CreateAccountControl cac)
	{
		//create contorller
		
		//Create a panel for labels on upper portion of GUI
		JPanel labelP = new JPanel(new GridLayout(3,1,5,5));
		errorLabel = new JLabel(" ", JLabel.CENTER);
		errorLabel.setForeground(Color.RED);
		JLabel instructionLabel = new JLabel("Enter a username and password to create an account", JLabel.CENTER);
		JLabel instructionLabel2 = new JLabel("Your password must be at least 6 characters.", JLabel.CENTER);
		labelP.add(errorLabel);
		labelP.add(instructionLabel);
		labelP.add(instructionLabel2);
		//-----------------------------------------------------------------------------------------------------------
		
		//Create a panel for the account information form
		JPanel accountP = new JPanel(new GridLayout(3,2,5,5));
		
		JLabel usernameLabel = new JLabel("Username:", JLabel.RIGHT);
		usernameField = new JTextField(10);
		
		JLabel passwordLabel = new JLabel("Password:", JLabel.RIGHT);
		passwordField = new JPasswordField(10);
		
		JLabel passwordVerifyLabel = new JLabel("Verify Password:", JLabel.RIGHT);
		passwordVerifyField = new JPasswordField(10);
		
		//add all labels and fields to the account panel
		accountP.add(usernameLabel);
		accountP.add(usernameField);
		accountP.add(passwordLabel);
		accountP.add(passwordField);
		accountP.add(passwordVerifyLabel);
		accountP.add(passwordVerifyField);
		//-----------------------------------------------------------------------------------------------------------
		
		//Create a button panel
		JPanel buttonP = new JPanel();
		
		JButton submitButton = new JButton("Submit");
	    submitButton.addActionListener((ActionListener) cac);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.addActionListener((ActionListener) cac);
		
		//add all buttons to the panel
		buttonP.add(submitButton);
		buttonP.add(cancelButton);
		//-----------------------------------------------------------------------------------------------------------
		
		//Add the three panels in a grid
		JPanel grid = new JPanel(new GridLayout(3,1,0,10));
		grid.add(labelP);
		grid.add(accountP);
		grid.add(buttonP);
		this.add(grid);
	}
}
