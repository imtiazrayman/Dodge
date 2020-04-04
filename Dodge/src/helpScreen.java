import java.awt.*;

public class helpScreen {
	//Rectangle(x , y, width, height_
	
	
		public Rectangle playButton = new Rectangle(Game.WIDTH/2 - 50 , 150, 100, 50); // placing the rectangles which will hold the menu items
		
		

		
		// if we wanted to add more options we just create another rectangle drop it down 100 and add a string to it.
																							 // then after we do that we can just use the on Mouse listener to have an event handler to allow the buttons to be pressed
																							// the class with the clicking events are in Mouse Input. 
		//public   
		
		
		
		public  void render(Graphics g) { // this class just makes our menu page and then renders them on the screen. 
			
			Graphics2D g2d = (Graphics2D) g; // casting g to graphics 2d because rectangles require g2d.
			
			Font fnt0 = new Font("ZapfDingbats", Font.BOLD, 50); // we an change the fonts to something more prettier. 
			g.setFont(fnt0);
			
			g.setColor(Color.white);
			
			g.drawString("Help Screen", Game.WIDTH/2 - 70, 100);
			
			Font fnt1 = new Font("arial" , Font.BOLD, 15);
			g.setFont(fnt1);
			
			g.drawString("Go back", playButton.x + 19, playButton.y + 30); //  placing the text within the rectangles
			g2d.draw(playButton);
			
			g.drawString("This game is a single or multiplayer Game", 15 , playButton.y + 50); // classic example of winging it lol
			g.drawString("First Player uses UP, DOWN, LEFT , RIGH ARROW KEYS TO MOVE ", 15 , playButton.y + 70); 
			g.drawString("SECOND Player uses W, A, S ,D  KEYS TO MOVE", 15, playButton.y + 90); 
			
			g2d.draw(playButton);
			
			
			
			
			
			
			
			
			
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

	
	

