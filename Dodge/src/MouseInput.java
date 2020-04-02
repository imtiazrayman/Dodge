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
		/*
	public Rectangle playButton = new Rectangle(Game.WIDTH/2 - 50 , 150, 100, 50); // placing the rectangles which will hold the menu items
	public Rectangle helpButton = new Rectangle(Game.WIDTH/2 - 50 , 250, 100, 50);
	public Rectangle quitButton = new Rectangle(Game.WIDTH/2 - 50, 350, 100, 50); 
	
	public Rectangle normalButton = new Rectangle(Game.WIDTH/2 - 50 + 200, 150, 150, 50);
	public Rectangle hardButton = new Rectangle(Game.WIDTH/2 - 50 + 200, 250, 150, 50);
	public Rectangle insaneButton = new Rectangle(Game.WIDTH/2 - 50 + 200, 350, 150, 50);

	public Rectangle firstPlayerButton = new Rectangle(Game.WIDTH/2 - 50 - 200, 250, 150, 50); 
	public Rectangle secondPlayerButton = new Rectangle(Game.WIDTH/2 - 50 - 200, 350, 150, 50); 
	public Rectangle statusReport = new Rectangle(Game.WIDTH/2 - 50 - 200, 50, 150 , 150); 
	*/
		
		//Rectangle(x , y, width, height)
		// these are the controls if we are in the menu screen so we map out the information if it was to be written on this screen, 
		if(Game.getgameState() == gameState.MENU ){
			// this is the play button
			if(mx >= Game.WIDTH/2 - 50 && mx <= Game.WIDTH /2 + 50 ) { // I am looking for my mouse to have the input in the box so i start at original x,y and set the boundaries for where the 
				// the rectangle should lay.
				
				if(my >= 150 && my < 200) {
					//pressed the play button
					Game.state = gameState.GAME;
				}
			}
			
			// THIS IS THE HELP BUTTON. 
			if(mx >= Game.WIDTH/2 - 50 && mx <= Game.WIDTH /2 + 50 ) { // I am looking for my mouse to have the input in the box so i start at original x,y and set the boundaries for where the 
				// the rectangle should lay.
				
				if(my >= 250 && my < 300) {
					//pressed the play button
					Game.state = gameState.HELP;
				}
			}
			
			// THIS IS THE EXIT BUTTON
			if(mx >= Game.WIDTH/2 - 50 && mx <= Game.WIDTH /2 + 50 ) { // I am looking for my mouse to have the input in the box so i start at original x,y and set the boundaries for where the 
						// the rectangle should lay.
						
				if(my >= 350 && my < 400) { // i start with first location and add the height to it so the button is in this part of the screen.
					//pressed the play button
					 System.exit(1);
					}
				}
			// This is the difficulty
			if(mx >= Game.WIDTH/2 - 50 + 200 && mx <= Game.WIDTH /2 + 50 + 200 + 150) { // I am looking for my mouse to have the input in the box so i start at original x,y and set the boundaries for where the 
				// the rectangle should lay.
				
				if(my >= 250 && my < 300) {
					//pressed the play button
					Game.state = gameState.LEVELS;
				}
			}
			
			
			
		}
			
			
		// these are the controls if we are in the Difficulty screen so we map out the information if it was to be written on this screen, 	
		if(Game.getgameState() == gameState.LEVELS)
		{
			// THIS IS THE NORMAL MODE BUTTON
			if(mx >= Game.WIDTH/2 - 50 && mx <= Game.WIDTH /2 + 50 ) { // I am looking for my mouse to have the input in the box so i start at original x,y and set the boundaries for where the 
				// the rectangle should lay.
				
				if(my >= 150 && my < 200) {
					//pressed the play button
					Game.state = gameState.NORMAL;
				}
			}
			
			// THIS IS THE HELP BUTTON. 
			if(mx >= Game.WIDTH/2 - 50 && mx <= Game.WIDTH /2 + 50 ) { // I am looking for my mouse to have the input in the box so i start at original x,y and set the boundaries for where the 
				// the rectangle should lay.
				
				if(my >= 250 && my < 300) {
					//pressed the play button
					Game.state = gameState.HARD;
				}
			}
			
			// THIS IS THE EXIT BUTTON
			if(mx >= Game.WIDTH/2 - 50 && mx <= Game.WIDTH /2 + 50 ) { // I am looking for my mouse to have the input in the box so i start at original x,y and set the boundaries for where the 
						// the rectangle should lay.
						
				if(my >= 350 && my < 400) { // i start with first location and add the height to it so the button is in this part of the screen.
					//pressed the play button
					Game.state = gameState.INSANE;
					}
				}
			
			// THIS IS THE GO BACK BUTTON TO THE MENU
			if(mx >= Game.WIDTH/2 - 50 - 200 && mx <= Game.WIDTH /2  - 50 - 200 + 150 ) { // I am looking for my mouse to have the input in the box so i start at original x,y and set the boundaries for where the 
						// the rectangle should lay.
						
				if(my >= 250 && my < 300) { // i start with first location and add the height to it so the button is in this part of the screen.
					//pressed the play button
					Game.state = gameState.MENU;
					}
				}
		
		}
		
		// these are the controls if we were to click the help button and was in the help screen. 
		if(Game.getgameState() == gameState.HELP )
		{
			
			if(mx >= Game.WIDTH/2 - 50 && mx <= Game.WIDTH /2 + 50 ) { // I am looking for my mouse to have the input in the box so i start at original x,y and set the boundaries for where the 
				// the rectangle should lay.
				
				if(my >= 150 && my < 200) {
					//pressed the play button
					Game.state = gameState.MENU;
				}
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
