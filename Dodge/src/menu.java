import java.awt.*;

public class menu {
	public static Rectangle playButton = new Rectangle(Game.WIDTH/2 - 50 , 150, 100, 50);
	public static Rectangle helpButton = new Rectangle(Game.WIDTH/2 - 50 , 250, 100, 50);
	public static Rectangle quitButton = new Rectangle(Game.WIDTH/2 - 50, 350, 100, 50);

	public static void render(Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g; // casting g to graphics 2d because rectangles require g2d.
		
		
		Font fnt0 = new Font("ZapfDingbats", Font.BOLD, 50);
		g.setFont(fnt0);
		g.setColor(Color.white);
		g.drawString("Dodge", Game.WIDTH/2 - 70, 100);
		
		Font fnt1 = new Font("arial" , Font.BOLD, 30);
		g.setFont(fnt1);
		g.drawString("Play", playButton.x + 19, playButton.y + 30);
		g2d.draw(playButton);
		g.drawString("Help", playButton.x + 19, playButton.y + 30);
		g2d.draw(helpButton);
		g.drawString("Quit", playButton.x + 19, playButton.y + 30);
		g2d.draw(quitButton);
		
	}
}
