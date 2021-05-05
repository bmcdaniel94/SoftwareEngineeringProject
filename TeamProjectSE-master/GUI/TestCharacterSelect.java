package GUI;

import static org.junit.Assert.*;

import java.awt.CardLayout;

import gameInterface.CharacterSelectControl;
import javax.swing.JButton;
import javax.swing.JPanel;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import clientSubSystem.GameClient;

public class TestCharacterSelect {
	
	 private static CharacterSelectPanel charSelect;
	 private JButton character;
	 private static GameClient client = new GameClient();

	  @BeforeClass
	  public static void setUp() 
	  {
		    CardLayout cardLayout = new CardLayout();
		    JPanel container = new JPanel(cardLayout);
		    
		    CharacterSelectControl cs = new CharacterSelectControl(container, client);
		    client.setCharacterSelectControl(cs);
		    
		    JPanel view4 = new CharacterSelectPanel(cs);
		    
		    container.add(view4, "4");
		    cardLayout.show(container, "4");
	    
	  }
	  
	  @Before
	  public void setupBeforeTest() throws Exception
	  {
	    character = view4.getButtonAt(0);
	    
	    Thread.sleep(5000);
	  }
	  @Test
	  public void testGetButtonAt() throws InterruptedException
	  {
		  for(int i = 0; i < 4; i++) {
			  JButton b = charSelect.getButtonAt(i);
			  b.doClick(500);
			  Thread.sleep(1000);
			  
		  }
	   
	    
	  }

}
