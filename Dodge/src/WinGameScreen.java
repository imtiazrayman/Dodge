import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class WinGameScreen {
	
	public statusUpdater status = new statusUpdater();
	
	public HUD stats = new HUD();
	
	public Rectangle replayButton = new Rectangle(Game.WIDTH/2 - 50 , 250, 100, 50);
	
	public Rectangle playButton = new Rectangle(Game.WIDTH/2 - 50 , 150, 100, 50);

	public Rectangle statusReport = new Rectangle(Game.WIDTH/2 - 50 - 200, 50, 150 , 150); 
	
	
	
	public  void render(Graphics g) { // this class just makes our menu page and then renders them on the screen. 
		
		int score = stats.getScore();
		int level = stats.getLevel();
		
		Graphics2D g2d = (Graphics2D) g; // casting g to graphics 2d because rectangles require g2d.
		
		
		Font fnt0 = new Font("ZapfDingbats", Font.BOLD, 50); // we an change the fonts to something more prettier. 
		g.setFont(fnt0);
		
		g.setColor(Color.white);
		
		g.drawString("YOU HAVE WON", Game.WIDTH/2 - 200, 100);
		
		Font fnt1 = new Font("arial" , Font.BOLD, 15);
		g.setFont(fnt1);
		
		// For now i will not put a replay button yet but i will later
		// i mainly want this screen to pop up based on the game ending
		
		g.drawString("Congradulations, you have won in Mode\n" + status.statusUpdater(), 10, playButton.y + 30); //  placing the text within the rectangles
		//g2d.draw(playButton);
		
		//g.drawString("You have won with a score of " + score + " and a level of " + level ,10,playButton.y + 30 + 30);
		
		
		g.drawString("Replay", replayButton.x + 19, replayButton.y + 30); // include run help screen help class
		g2d.draw(replayButton);
		}
}
