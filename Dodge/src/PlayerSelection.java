
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class PlayerSelection {
	
	statusUpdater status = new statusUpdater();
	
	public Rectangle singleButton = new Rectangle(Game.WIDTH/2 - 50 , 150, 100, 50);
	// placing the rectangles which will hold the menu items
	public Rectangle twoButton = new Rectangle(Game.WIDTH/2 - 50 , 250, 100, 50);
	
	public Rectangle gobackButton = new Rectangle(Game.WIDTH/2 - 50 - 200, 350, 150, 50); 
	
	public Rectangle statusReport = new Rectangle(Game.WIDTH/2 - 50 - 200, 50, 150 , 150); 
	
	
	// need to make a go back button.
	
		// if we wanted to add more options we just create another rectangle drop it down 100 and add a string to it.
																							 // then after we do that we can just use the on Mouse listener to have an event handler to allow the buttons to be pressed
																							// the class with the clicking events are in Mouse Input. 
		//public   
		
		
		
		public  void render(Graphics g) { // this class just makes our menu page and then renders them on the screen. 
			
			Graphics2D g2d = (Graphics2D) g; // casting g to graphics 2d because rectangles require g2d.
			
			Font fnt0 = new Font("ZapfDingbats", Font.BOLD, 30); // we an change the fonts to something more prettier. 
			g.setFont(fnt0);
			
			g.setColor(Color.white);
			
			g.drawString("Select Your Mode", Game.WIDTH/2 - 70, 100);
			
			Font fnt1 = new Font("arial" , Font.BOLD, 15);
			g.setFont(fnt1);
			
			g.drawString("Single Player", singleButton.x + 5 , singleButton.y + 30); // spawner
			g2d.draw(singleButton);
			
			g.drawString("Two Player", twoButton.x + 19 , twoButton.y + 30); // include spawner
			g2d.draw(twoButton);
			
			g.drawString("Go Back", gobackButton.x + 19 , gobackButton.y + 30); // spawner 
			g2d.draw(gobackButton);
			
			
			statusUpdater status = new statusUpdater();
			String selectedOptions = status.statusUpdater();
			selectedOptions += "\n";
			//15, 15, 200, 32
			g.setColor(Color.white);
			
			Font fnt12 = new Font( "arial" , Font.ITALIC, 20);
			g.setFont(fnt1);
			
			
			g.drawString( selectedOptions , 15 , 15); // I need to put a string for the update of the information that the user presses
			//g2d.draw(statusReport);
			
		
			
			
		}
	}


