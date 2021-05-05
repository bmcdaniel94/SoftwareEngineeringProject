package GUI;

import java.awt.*;
import javax.swing.*;

public class InitialPanel extends JPanel 
{
	//Constructor for initial panel
	public InitialPanel(InitialControl ic)
	{
		//Create the controller
		
		//Create info label
		JLabel label = new JLabel("Account Information", JLabel.CENTER);
		
		//Create login button
		JButton loginButton = new JButton("Login");
		loginButton.addActionListener(ic);
		JPanel loginButtonBuffer = new JPanel();
		loginButtonBuffer.add(loginButton);
		
		//Create create account button
		JButton createButton = new JButton("Create");
		createButton.addActionListener(ic);
		JPanel createButtonBuffer = new JPanel();
		createButtonBuffer.add(createButton);
		
		//Arrange components into a grid
		JPanel grid = new JPanel(new GridLayout(3,1,5,5));
		grid.add(label);
		grid.add(loginButtonBuffer);
		grid.add(createButtonBuffer);
		this.add(grid);
	}
}
