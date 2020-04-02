import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseInput implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) { // we only want to implement this method, which is the event that looks for when the mouse is pressed. 
		
		
		int mx = e.getX();// these are the x and y coordinates of the mouse class.
		int my = e.getY();
		/*public static Rectangle playButton = new Rectangle(Game.WIDTH/2 - 50 , 150, 100, 50);
		public static Rectangle helpButton = new Rectangle(Game.WIDTH/2 - 50 , 250, 100, 50);
		public static Rectangle quitButton = new Rectangle(Game.WIDTH/2 - 50, 350, 100, 50);*/
		
		//Rectangle(x , y, width, height)
		
		// this is the play button
		if(mx >= Game.WIDTH/2 - 50 && mx <= Game.WIDTH /2 + 50 ) { // I am looking for my mouse to have the input in the box so i start at original x,y and set the boundaries for where the 
			// the rectangle should lay.
			
			if(my >= 150 && my < 200) {
				//pressed the play button
				Game.state = gameState.GAME;
			}
		}
		
		/*if(mx >= Game.WIDTH/2 - 50 && mx <= Game.WIDTH /2 + 50 ) { // I am looking for my mouse to have the input in the box so i start at original x,y and set the boundaries for where the 
			// the rectangle should lay.
			
			if(my >= 250 && my < 300) {
				//pressed the play button
				Game.state = gameState.GAME;
			}
		}*/
		
		// this is the play button
		if(mx >= Game.WIDTH/2 - 50 && mx <= Game.WIDTH /2 + 50 ) { // I am looking for my mouse to have the input in the box so i start at original x,y and set the boundaries for where the 
					// the rectangle should lay.
					
			if(my >= 350 && my < 400) { // i start with first location and add the height to it so the button is in this part of the screen.
				//pressed the play button
				 System.exit(1);
				}
			}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
