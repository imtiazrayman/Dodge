import java.awt.*;

public class menu {
	
	//Rectangle(x , y, width, height_
	public Rectangle playButton = new Rectangle(Game.WIDTH/2 - 50 , 150, 100, 50); // placing the rectangles which will hold the menu items
	public Rectangle helpButton = new Rectangle(Game.WIDTH/2 - 50 , 250, 100, 50);
	public Rectangle quitButton = new Rectangle(Game.WIDTH/2 - 50, 350, 100, 50); 
	
	public Rectangle normalButton = new Rectangle(Game.WIDTH/2 - 50 + 200, 150, 150, 50);
	public Rectangle hardButton = new Rectangle(Game.WIDTH/2 - 50 + 200, 250, 150, 50);
	public Rectangle insaneButton = new Rectangle(Game.WIDTH/2 - 50 + 200, 350, 150, 50);

	public Rectangle firstPlayerButton = new Rectangle(Game.WIDTH/2 - 50 - 200, 150, 150, 50); 
	public Rectangle secondPlayerButton = new Rectangle(Game.WIDTH/2 - 50 - 200, 250, 150, 50); 
	
	
	// if we wanted to add more options we just create another rectangle drop it down 100 and add a string to it.
																						 // then after we do that we can just use the on Mouse listener to have an event handler to allow the buttons to be pressed
																						// the class with the clicking events are in Mouse Input. 
	
	
	public  void render(Graphics g) { // this class just makes our menu page and then renders them on the screen. 
		
		Graphics2D g2d = (Graphics2D) g; // casting g to graphics 2d because rectangles require g2d.
		
		Font fnt0 = new Font("ZapfDingbats", Font.BOLD, 50); // we an change the fonts to something more prettier. 
		g.setFont(fnt0);
		
		g.setColor(Color.white);
		
		g.drawString("Dodge", Game.WIDTH/2 - 70, 100);
		
		Font fnt1 = new Font("arial" , Font.BOLD, 30);
		g.setFont(fnt1);
		
		g.drawString("Play", playButton.x + 19, playButton.y + 30); //  placing the text within the rectangles
		g2d.draw(playButton);
		
		g.drawString("Help", helpButton.x + 19, helpButton.y + 30);
		g2d.draw(helpButton);
		
		g.drawString("Quit", quitButton.x + 19, quitButton.y + 30);
		g2d.draw(quitButton);
		
		
		g.drawString("Normal", normalButton.x + 19 , normalButton.y + 30);
		g2d.draw(normalButton);
		
		g.drawString("Hard", hardButton.x + 19 , hardButton.y + 30);
		g2d.draw(hardButton);
		
		g.drawString("Insane", insaneButton.x + 19 , insaneButton.y + 30);
		g2d.draw(insaneButton);
		
		g.drawString("First Player", firstPlayerButton.x + 19 , firstPlayerButton.y + 19);
		g2d.draw(firstPlayerButton);
		
		
		
		
	}
}
