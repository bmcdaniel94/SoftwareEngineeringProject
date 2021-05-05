package GUI;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

import clientSubSystem.LoginControl;


public class LoginPanel extends JPanel
{
	//private datafields
	private JTextField usernameField;
	private JPasswordField passwordField;
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
	
	//setter for error text
	public void setError(String error)
	{
		errorLabel.setText(error);
	}
	
	//Constructor for login panel
	public LoginPanel(LoginControl lc)
	{
		//create the controller
		
		//Create a panel for labels on top of GUI
		JPanel labelP = new JPanel (new GridLayout(2,1,5,5));
		
		errorLabel = new JLabel("", JLabel.CENTER);
		errorLabel.setForeground(Color.RED);
		
		JLabel instructionLabel = new JLabel("Enter your username and password to log in", JLabel.CENTER);
		
		//add labels to panel
		labelP.add(errorLabel);
		labelP.add(instructionLabel);
		//-----------------------------------------------------------------------------------------------------------
		
		//Create a panel for the login info form
		JPanel loginP = new JPanel(new GridLayout(2,2,5,5));
		
		JLabel usernameLabel = new JLabel("Username:" , JLabel.RIGHT);
		usernameField = new JTextField(10);
		
		JLabel passwordLabel = new JLabel("Password:", JLabel.RIGHT);
		passwordField = new JPasswordField(10);
		
		//add labels and fields to login panel
		loginP.add(usernameLabel);
		loginP.add(usernameField);
		loginP.add(passwordLabel);
		loginP.add(passwordField);
		//-----------------------------------------------------------------------------------------------------------
		
		//Create a panel for buttons
		JPanel buttonP = new JPanel();
		
		JButton submitButton = new JButton("Submit");
		submitButton.addActionListener((ActionListener) lc);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.addActionListener((ActionListener) lc);
		
		//add labels and buttons
		buttonP.add(submitButton);
		buttonP.add(cancelButton);
		//-----------------------------------------------------------------------------------------------------------
		
		//add panels to the grid
		JPanel grid = new JPanel(new GridLayout(3,1,0,10));
		grid.add(labelP);
		grid.add(loginP);
		grid.add(buttonP);
		this.add(grid);
	}
}
