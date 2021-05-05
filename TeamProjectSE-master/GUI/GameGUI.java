package GUI;

import java.awt.*;
import java.io.IOException;
import javax.swing.*;
import clientSubSystem.*;
import gameInterface.*;



public class GameGUI extends JFrame
{
  
  
  // Constructor that creates the client GUI.
  public GameGUI()
  {
    // Set up the chat client.
    GameClient client = new GameClient();
    client.setHost("localhost");
    client.setPort(8300);
    try
    {
      client.openConnection();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
    
    
    
    // Set the title and default close operation.
    this.setTitle("Game Client");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    // Create the card layout container.
    CardLayout cardLayout = new CardLayout();
    JPanel container = new JPanel(cardLayout);
    
    //Create the Controllers next
    //Next, create the Controllers
    InitialControl ic = new InitialControl(container,client);
    LoginControl lc = new LoginControl(container,client);
    CreateAccountControl cac = new CreateAccountControl(container,client);
    CharacterSelectControl cs = new CharacterSelectControl(container, client);
    GameLobbyControl gl = new GameLobbyControl(container, client);
    P1GameArenaControl ga1 = new P1GameArenaControl(container, client);
    P2GameArenaControl ga2 = new P2GameArenaControl(container, client);
    
    //Set the client info
    client.setLoginControl(lc);
    client.setCreateAccountControl(cac);
    client.setCharacterSelectControl(cs);
    client.setGameLobbyControl(gl);
    //client.setGameArenaControl1(ga1);
    //client.setGameArenaControl2(ga2);
   
    
    // Create the four views. (need the controller to register with the Panels
    JPanel view1 = new InitialPanel(ic);
    JPanel view2 = new LoginPanel(lc);
    JPanel view3 = new CreateAccountPanel(cac);
    JPanel view4 = new CharacterSelectPanel(cs);
    JPanel view5 = new GameLobbyPanel(gl);
    JPanel view6 = new P1GameArenaPanel(ga1);
    JPanel view7 = new P2GameArenaPanel(ga2);
    
    // Add the views to the card layout container.
    container.add(view1, "1");
    container.add(view2, "2");
    container.add(view3, "3");
    container.add(view4, "4");
    container.add(view5, "5");
    container.add(view6, "6");
    container.add(view7, "7");
   
    
    // Show the initial view in the card layout.
    cardLayout.show(container, "1");
    
    // Add the card layout container to the JFrame.
    // GridBagLayout makes the container stay centered in the window.
    this.setLayout(new GridBagLayout());
    this.add(container);

    // Show the JFrame.
    this.setSize(1200, 1200);
    this.setVisible(true);
  }

  // Main function that creates the client GUI when the program is started.
  public static void main(String[] args)
  {
	  //starts
    new GameGUI();
  }
}

